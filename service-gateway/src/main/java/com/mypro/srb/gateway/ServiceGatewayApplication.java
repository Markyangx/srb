package com.mypro.srb.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.gateway
 * @ClassName: ServiceGatewayApplication
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/9 18:12
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceGatewayApplication.class, args);
    }
}