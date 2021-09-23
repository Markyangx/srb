package com.mypro.srb.core.pojo.bo;

import com.mypro.srb.core.enums.TransTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.core.pojo.bo
 * @ClassName: TransFlowBO
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/12 10:57
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransFlowBO {
    private String agentBillNo;
    private String bindCode;
    private BigDecimal amount;
    private TransTypeEnum transTypeEnum;
    private String memo;
}
