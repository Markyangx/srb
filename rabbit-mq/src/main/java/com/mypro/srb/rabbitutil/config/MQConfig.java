package com.mypro.srb.rabbitutil.config;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.rabbitutil.config
 * @ClassName: MQConfig
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/13 18:04
 * @Version: 1.0
 */

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig {

    @Bean
    public MessageConverter messageConverter(){
        //json字符串转换器
        return new Jackson2JsonMessageConverter();
    }
}
