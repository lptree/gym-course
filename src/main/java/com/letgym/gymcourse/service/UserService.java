package com.letgym.gymcourse.service;
import com.letgym.gymcourse.model.User;
import com.letgym.gymcourse.core.Service;
import com.letgym.gymcourse.model.custom.UserDetailInfo;


/**
 * Created by CodeGenerator on 2018/04/02.
 */
public interface UserService extends Service<User> {

    UserDetailInfo getUserDetailInfo(Integer uid);
}
