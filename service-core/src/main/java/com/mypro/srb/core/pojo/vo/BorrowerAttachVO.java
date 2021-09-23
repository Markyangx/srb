package com.mypro.srb.core.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.core.pojo.vo
 * @ClassName: BorrowerAttachVO
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/11 14:40
 * @Version: 1.0
 */
@Data
@ApiModel(value="借款人附件资料")
public class BorrowerAttachVO {

    @ApiModelProperty(value = "图片类型（idCard1：身份证正面，idCard2：身份证反面，house：房产证，car：车）")
    private String imageType;

    @ApiModelProperty(value = "图片路径")
    private String imageUrl;
}
