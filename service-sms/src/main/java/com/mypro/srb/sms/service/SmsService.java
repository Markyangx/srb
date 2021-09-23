package com.mypro.srb.sms.service;

import java.util.Map;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.sms.service
 * @ClassName: SmsService
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/7 17:00
 * @Version: 1.0
 */
public interface SmsService {

    void send(String mobile, String templateCode, Map<String,Object> param);
}
