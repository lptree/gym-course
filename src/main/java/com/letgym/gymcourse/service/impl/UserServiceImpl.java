package com.letgym.gymcourse.service.impl;

import com.letgym.gymcourse.dao.UserMapper;
import com.letgym.gymcourse.model.User;
import com.letgym.gymcourse.model.custom.UserDetailInfo;
import com.letgym.gymcourse.service.UserService;
import com.letgym.gymcourse.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/02.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public UserDetailInfo getUserDetailInfo(Integer uid) {
        UserDetailInfo result =null;

        try {
            result =userMapper.getUserDetailInfo(uid);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

        return result;
    }
}
