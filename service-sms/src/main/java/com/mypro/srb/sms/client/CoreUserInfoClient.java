package com.mypro.srb.sms.client;

import com.mypro.srb.sms.client.fallback.CoreUserInfoClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.sms.client
 * @ClassName: CoreUserInfoClient
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/9 17:18
 * @Version: 1.0
 */
@FeignClient(value = "service-core",fallback = CoreUserInfoClientFallback.class)
public interface CoreUserInfoClient {

    @GetMapping("/api/core/userInfo/checkMobile/{mobile}")
    boolean checkMobile(@PathVariable String mobile);
}