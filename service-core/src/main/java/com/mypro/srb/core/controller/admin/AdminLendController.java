package com.mypro.srb.core.controller.admin;

import com.mypro.common.result.ResultWarrp;
import com.mypro.srb.core.pojo.entity.Lend;
import com.mypro.srb.core.service.LendService;
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
import java.util.Map;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.core.controller.admin
 * @ClassName: AdminLendController
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/11 20:49
 * @Version: 1.0
 */

@Api(tags = "标的管理")
@RestController
@RequestMapping("/admin/core/lend")
@Slf4j
public class AdminLendController {

    @Resource
    private LendService lendService;

    @ApiOperation("标的列表")
    @GetMapping("/list")
    public ResultWarrp list() {
        List<Lend> lendList = lendService.selectList();
        return ResultWarrp.ok().data("list", lendList);
    }

    @ApiOperation("获取标的信息")
    @GetMapping("/show/{id}")
    public ResultWarrp show(
            @ApiParam(value = "标的id", required = true)
            @PathVariable Long id) {
        Map<String, Object> result = lendService.getLendDetail(id);
        return ResultWarrp.ok().data("lendDetail", result);
    }

    @ApiOperation("放款")
    @GetMapping("/makeLoan/{id}")
    public ResultWarrp makeLoan(
            @ApiParam(value = "标的id", required = true)
            @PathVariable("id") Long id) {
        lendService.makeLoan(id);
        return ResultWarrp.ok().message("放款成功");
    }
}
