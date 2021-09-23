package com.mypro.srb.sms;

import com.mypro.srb.sms.util.SmsProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.sms
 * @ClassName: SMSTest
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/7 16:58
 * @Version: 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SMSTest {

    @Test
    public void testProperties(){
        System.out.println(SmsProperties.KEY_ID);
        System.out.println(SmsProperties.KEY_SECRET);
        System.out.println(SmsProperties.REGION_Id);
    }
}
