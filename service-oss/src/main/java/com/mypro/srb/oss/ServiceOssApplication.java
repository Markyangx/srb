package com.mypro.srb.oss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.oss
 * @ClassName: ServiceOssApplication
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/7 20:38
 * @Version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
@ComponentScan({"com.mypro.srb", "com.mypro.common"})
public class ServiceOssApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceOssApplication.class, args);
    }

}
