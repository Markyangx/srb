package com.mypro.srb.core.controller.admin;

import com.mypro.common.exception.Assert;
import com.mypro.common.result.ResponseEnum;
import com.mypro.common.result.ResultWarrp;
import com.mypro.srb.core.pojo.entity.IntegralGrade;
import com.mypro.srb.core.service.IntegralGradeService;
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
 * @ClassName: AdminIntegralGradeController
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/5 11:48
 * @Version: 1.0
 */
@Slf4j
//@CrossOrigin
@RestController
@Api(tags = "积分等级管理")
@RequestMapping("/admin/core/integralGrade")
public class AdminIntegralGradeController {
    @Resource
    private IntegralGradeService integralGradeService;

    @ApiOperation("查询积分列表")
    @GetMapping("/list")
    public ResultWarrp listAll() {
        List<IntegralGrade> list = integralGradeService.list();
        return ResultWarrp.ok().data("list", list).message("查询成功");
    }

    @ApiOperation(value = "根据id删除记录", notes = "逻辑删除")
    @DeleteMapping("/remove/{id}")
    public ResultWarrp removeById(@ApiParam(value = "数据id", required = true, example = "100")
                                  @PathVariable Long id) {
        boolean b = integralGradeService.removeById(id);
        if (b) {
            return ResultWarrp.ok().message("删除成功");
        } else {
            return ResultWarrp.error().message("删除失败");
        }
    }

    @ApiOperation("保存积分对象")
    @PostMapping("/save")
    public ResultWarrp save(@ApiParam(value = "积分等级对象", required = true)
                            @RequestBody IntegralGrade integralGrade) {
//        if (integralGrade.getBorrowAmount() == null) {
//            throw new BusinessException(ResponseEnum.BORROW_AMOUNT_NULL_ERROR);
//        }
        Assert.notNull(integralGrade.getBorrowAmount(), ResponseEnum.BORROW_AMOUNT_NULL_ERROR);
        boolean save = integralGradeService.save(integralGrade);
        if (save) {
            return ResultWarrp.ok().message("保存成功");
        } else {
            return ResultWarrp.error().message("保存失败");
        }
    }

    @ApiOperation("根据id获取积分对象")
    @GetMapping("/getById/{id}")
    public ResultWarrp getById(@PathVariable Long id) {
        IntegralGrade byId = integralGradeService.getById(id);
        if (byId != null) {
            return ResultWarrp.ok().data("integralGrade", byId).message("查询成功");
        } else {
            return ResultWarrp.error().message("查询到失败");
        }
    }

    @ApiOperation("根据id更新积分对象")
    @PutMapping("/updateById")
    public ResultWarrp updateById(@ApiParam(value = "积分等级对象", required = true)
                                  @RequestBody IntegralGrade integralGrade) {
        boolean save = integralGradeService.updateById(integralGrade);
        if (save) {
            return ResultWarrp.ok().message("更新成功");
        } else {
            return ResultWarrp.error().message("更新失败");
        }
    }
}
