package com.mypro.srb.core.pojo.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.core.pojo.vo
 * @ClassName: InvestVO
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/13 10:04
 * @Version: 1.0
 */
@Data
@ApiModel(description = "投标信息")
public class InvestVO {

    private Long lendId;

    //投标金额
    private String investAmount;

    //用户id
    private Long investUserId;

    //用户姓名
    private String investName;
}
