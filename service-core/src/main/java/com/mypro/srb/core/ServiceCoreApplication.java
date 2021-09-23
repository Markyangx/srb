package com.mypro.srb.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.core
 * @ClassName: ServiceCoreApplication
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/5 11:42
 * @Version: 1.0
 */

@SpringBootApplication
@EnableFeignClients
@ComponentScan({"com.mypro.srb","com.mypro.common"})
public class ServiceCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCoreApplication.class, args);
    }
}