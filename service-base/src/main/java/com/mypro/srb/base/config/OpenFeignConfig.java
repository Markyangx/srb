package com.mypro.srb.base.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.base.config
 * @ClassName: OpenFeignConfig
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/9 17:37
 * @Version: 1.0
 */
@Configuration
public class OpenFeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
