package com.mypro.srb.core.controller.admin;

import com.mypro.common.result.ResultWarrp;
import com.mypro.srb.core.pojo.entity.BorrowInfo;
import com.mypro.srb.core.pojo.vo.BorrowInfoApprovalVO;
import com.mypro.srb.core.service.BorrowInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.core.controller.admin
 * @ClassName: AdminBorrowInfoController
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/11 16:38
 * @Version: 1.0
 */
@Api(tags = "借款管理")
@RestController
@RequestMapping("/admin/core/borrowInfo")
@Slf4j
public class AdminBorrowInfoController {

    @Resource
    private BorrowInfoService borrowInfoService;

    @ApiOperation("借款信息列表")
    @GetMapping("/list")
    public ResultWarrp list() {
        List<BorrowInfo> borrowInfoList = borrowInfoService.selectList();
        return ResultWarrp.ok().data("list", borrowInfoList);
    }

    @ApiOperation("获取借款信息")
    @GetMapping("/show/{id}")
    public ResultWarrp show(
            @ApiParam(value = "借款id", required = true)
            @PathVariable Long id) {
        Map<String, Object> borrowInfoDetail = borrowInfoService.getBorrowInfoDetail(id);
        return ResultWarrp.ok().data("borrowInfoDetail", borrowInfoDetail);
    }

    @ApiOperation("审批借款信息")
    @PostMapping("/approval")
    public ResultWarrp approval(@RequestBody BorrowInfoApprovalVO borrowInfoApprovalVO) {

        borrowInfoService.approval(borrowInfoApprovalVO);
        return ResultWarrp.ok().message("审批完成");
    }
}
