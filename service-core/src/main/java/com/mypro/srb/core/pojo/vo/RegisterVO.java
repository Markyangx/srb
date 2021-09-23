package com.mypro.srb.core.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.core.pojo.vo
 * @ClassName: RegisterVO
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/9 11:10
 * @Version: 1.0
 */
@Data
@ApiModel(description="注册对象")
public class RegisterVO {

    @ApiModelProperty(value = "用户类型")
    private Integer userType;

    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "验证码")
    private String code;

    @ApiModelProperty(value = "密码")
    private String password;
}
