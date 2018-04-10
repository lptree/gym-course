package com.letgym.gymcourse.dao;

import com.letgym.gymcourse.core.Mapper;
import com.letgym.gymcourse.model.User;
import com.letgym.gymcourse.model.custom.UserDetailInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends Mapper<User> {

    @Select("select t1.uid,t1.mobile,t1.type,t1.registerTime,t2.* from user t1 \n" +
            "left join user_info t2 on t1.uid = t2.uid\n" +
            "where t1.isdelete = 0 and t1.uid = #{uid}")
    UserDetailInfo getUserDetailInfo(Integer uid);
}