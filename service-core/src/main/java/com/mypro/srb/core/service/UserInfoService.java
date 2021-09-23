package com.mypro.srb.core.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mypro.srb.core.pojo.entity.UserInfo;
import com.mypro.srb.core.pojo.query.UserInfoQuery;
import com.mypro.srb.core.pojo.vo.LoginVO;
import com.mypro.srb.core.pojo.vo.RegisterVO;
import com.mypro.srb.core.pojo.vo.UserIndexVO;
import com.mypro.srb.core.pojo.vo.UserInfoVO;

/**
 * <p>
 * 用户基本信息 服务类
 * </p>
 *
 * @author YXL
 * @since 2021-09-05
 */
public interface UserInfoService extends IService<UserInfo> {

    void register(RegisterVO registerVO);

    UserInfoVO login(LoginVO loginVO, String ip);

    IPage<UserInfo> listPage(Page<UserInfo> pageParam, UserInfoQuery userInfoQuery);

    void lock(Long id, Integer status);

    boolean checkMobile(String mobile);

    UserIndexVO getIndexUserInfo(Long userId);

    String getMobileByBindCode(String bindCode);
}
