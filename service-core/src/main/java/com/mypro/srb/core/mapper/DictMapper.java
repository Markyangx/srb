package com.mypro.srb.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mypro.srb.core.pojo.dto.ExcelDictDTO;
import com.mypro.srb.core.pojo.entity.Dict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 数据字典 Mapper 接口
 * </p>
 *
 * @author YXL
 * @since 2021-09-05
 */
public interface DictMapper extends BaseMapper<Dict> {


    void insertBatch(@Param("list") List<ExcelDictDTO> list);

}
