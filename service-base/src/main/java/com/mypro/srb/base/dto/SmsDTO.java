package com.mypro.srb.base.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.base.dto
 * @ClassName: SmsDTO
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/13 18:06
 * @Version: 1.0
 */
@Data
@ApiModel(description = "短信")
public class SmsDTO {

    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "消息内容")
    private String message;
}
