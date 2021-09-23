package com.mypro.srb.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.sms
 * @ClassName: ServiceSmsApplication
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/7 16:37
 * @Version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
@ComponentScan({"com.mypro.srb", "com.mypro.common"})
public class ServiceSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSmsApplication.class, args);
    }
}
