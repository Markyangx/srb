package com.mypro.srb.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mypro.srb.core.pojo.dto.ExcelDictDTO;
import com.mypro.srb.core.pojo.entity.Dict;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 数据字典 服务类
 * </p>
 *
 * @author YXL
 * @since 2021-09-05
 */
public interface DictService extends IService<Dict> {
    void importData(InputStream inputStream);

    List<ExcelDictDTO> listDictData();

    List<Dict> listByParentId(Long parentId);

    List<Dict> findByDictCode(String dictCode);

    String getNameByParentDictCodeAndValue(String education, Integer education1);
}
