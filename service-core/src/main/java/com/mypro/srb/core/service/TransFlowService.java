package com.mypro.srb.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mypro.srb.core.pojo.bo.TransFlowBO;
import com.mypro.srb.core.pojo.entity.TransFlow;

import java.util.List;

/**
 * <p>
 * 交易流水表 服务类
 * </p>
 *
 * @author YXL
 * @since 2021-09-05
 */
public interface TransFlowService extends IService<TransFlow> {

    void saveTransFlow(TransFlowBO transFlowBO);

    boolean isSaveTransFlow(String agentBillNo);

    List<TransFlow> selectByUserId(Long userId);
}
