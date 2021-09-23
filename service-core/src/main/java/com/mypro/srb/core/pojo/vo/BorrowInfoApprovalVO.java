package com.mypro.srb.core.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.core.pojo.vo
 * @ClassName: BorrowInfoApprovalVO
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/11 16:48
 * @Version: 1.0
 */
@Data
@ApiModel(description = "借款信息审批")
public class BorrowInfoApprovalVO {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "审批内容")
    private String content;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "年化利率")
    private BigDecimal lendYearRate;

    @ApiModelProperty(value = "平台服务费率")
    private BigDecimal serviceRate;

    @ApiModelProperty(value = "开始日期")
    private String lendStartDate;

    @ApiModelProperty(value = "描述信息")
    private String lendInfo;
}
