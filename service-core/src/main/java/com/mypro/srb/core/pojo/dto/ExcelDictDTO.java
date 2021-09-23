package com.mypro.srb.core.pojo.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.core.pojo.dto
 * @ClassName: ExcelDictDTO
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/6 22:00
 * @Version: 1.0
 */
@Data
public class ExcelDictDTO {

    @ExcelProperty("id")
    private Long id;

    @ExcelProperty("上级id")
    private Long parentId;

    @ExcelProperty("名称")
    private String name;

    @ExcelProperty("值")
    private Integer value;

    @ExcelProperty("编码")
    private String dictCode;
}
