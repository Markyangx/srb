package com.mypro.srb.core.controller.admin;

import com.baomidou.mybatisplus.extension.api.R;
import com.mypro.common.result.ResultWarrp;
import com.mypro.srb.core.pojo.entity.LendReturn;
import com.mypro.srb.core.service.LendReturnService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.core.controller.admin
 * @ClassName: AdminLendReturnController
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/13 16:52
 * @Version: 1.0
 */
@Api(tags = "还款记录")
@RestController
@RequestMapping("/admin/core/lendReturn")
@Slf4j
public class AdminLendReturnController {

    @Resource
    private LendReturnService lendReturnService;

    @ApiOperation("获取列表")
    @GetMapping("/list/{lendId}")
    public ResultWarrp list(
            @ApiParam(value = "标的id", required = true)
            @PathVariable Long lendId) {
        List<LendReturn> list = lendReturnService.selectByLendId(lendId);
        return ResultWarrp.ok().data("list", list);
    }
}
