package com.mypro.srb.core.controller.admin;

import com.mypro.common.result.ResultWarrp;
import com.mypro.srb.core.pojo.entity.UserLoginRecord;
import com.mypro.srb.core.service.UserLoginRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.core.controller.admin
 * @ClassName: AdminUserLoginRecordController
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/9 16:29
 * @Version: 1.0
 */
@Api(tags = "会员登录日志接口")
@RestController
@RequestMapping("/admin/core/userLoginRecord")
@Slf4j
//@CrossOrigin
public class AdminUserLoginRecordController {

    @Resource
    private UserLoginRecordService userLoginRecordService;

    @ApiOperation("获取会员登录日志列表")
    @GetMapping("/listTop50/{userId}")
    public ResultWarrp listTop50(
            @ApiParam(value = "用户id", required = true)
            @PathVariable Long userId) {
        List<UserLoginRecord> userLoginRecordList = userLoginRecordService.listTop50(userId);
        return ResultWarrp.ok().data("list", userLoginRecordList);
    }
}
