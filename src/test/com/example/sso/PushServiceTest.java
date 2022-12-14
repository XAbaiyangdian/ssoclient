package com.example.sso;

import com.example.sso.dto.response.SSOResult;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public class PushServiceTest {

    @Resource
    private PushService pushService;

    @Test
    public void pushUser() {
        String loginName = "liyanhong";
        String mobile = "13211112223";
        String company = "百度网络科技有限公司";
        String uscc = "91310000775785552L";
        String cfcaKeyId = "";

        String realName = "李彦宏";
        String idCard = "420682198711075511";

        SSOResult ssoResult = pushService.pushUser(loginName, mobile, company, uscc, cfcaKeyId, realName, idCard);
        assert ssoResult.isSuccess();
        Object userId = ssoResult.getData();
        System.out.println(userId);
    }
}