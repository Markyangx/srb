package com.mypro.srb.core.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.mypro.srb.core.mapper.DictMapper;
import com.mypro.srb.core.pojo.dto.ExcelDictDTO;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.core.listener
 * @ClassName: ExcelDictDTOListener
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/6 22:01
 * @Version: 1.0
 */
@Slf4j
//@AllArgsConstructor //全参
@NoArgsConstructor //无参
public class ExcelDictDTOListener extends AnalysisEventListener<ExcelDictDTO> {

    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 5;
    List<ExcelDictDTO> list = new ArrayList();

    private DictMapper dictMapper;

    //传入mapper对象
    public ExcelDictDTOListener(DictMapper dictMapper) {
        this.dictMapper = dictMapper;
    }


    @Override
    public void invoke(ExcelDictDTO data, AnalysisContext analysisContext) {
        log.info("解析到一条记录: {}", data);
        list.add(data);
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (list.size() >= BATCH_COUNT) {
            saveData();
            // 存储完成清理 list
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        // 这里也要保存数据，确保最后遗留的数据也存储到数据库
        saveData();
        log.info("所有数据解析完成！");
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        log.info("{}条数据，开始存储数据库！", list.size());
        dictMapper.insertBatch(list);  //批量插入
        log.info("存储数据库成功！");
    }
}
