package com.mypro.srb.sms.client.fallback;

import com.mypro.srb.sms.client.CoreUserInfoClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.sms.client.impl
 * @ClassName: CoreUserInfoClientFallback
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/9 18:00
 * @Version: 1.0
 */
@Service
@Slf4j
public class CoreUserInfoClientFallback implements CoreUserInfoClient {
    @Override
    public boolean checkMobile(String mobile) {
        log.error("远程调用失败，服务熔断");
        return false;
    }
}