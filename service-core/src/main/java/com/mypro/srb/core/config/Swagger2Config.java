package com.mypro.srb.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.core.config
 * @ClassName: Swagger2Config
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/22 9:51
 * @Version: 1.0
 */
@Configuration
@EnableSwagger2
@Profile({"dev","test"})
//@ConditionalOnProperty(name = "swagger.enable", havingValue = "true")
public class Swagger2Config {
}
