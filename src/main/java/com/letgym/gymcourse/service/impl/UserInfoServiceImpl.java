package com.letgym.gymcourse.service.impl;

import com.letgym.gymcourse.dao.UserInfoMapper;
import com.letgym.gymcourse.model.UserInfo;
import com.letgym.gymcourse.service.UserInfoService;
import com.letgym.gymcourse.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/02.
 */
@Service
@Transactional
public class UserInfoServiceImpl extends AbstractService<UserInfo> implements UserInfoService {
    @Resource
    private UserInfoMapper userInfoMapper;

}
