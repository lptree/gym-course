package com.letgym.gymcourse.service.impl;

import com.letgym.gymcourse.dao.CourseScheduleMembersMapper;
import com.letgym.gymcourse.model.CourseScheduleMembers;
import com.letgym.gymcourse.service.CourseScheduleMembersService;
import com.letgym.gymcourse.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/02.
 */
@Service
@Transactional
public class CourseScheduleMembersServiceImpl extends AbstractService<CourseScheduleMembers> implements CourseScheduleMembersService {
    @Resource
    private CourseScheduleMembersMapper courseScheduleMembersMapper;

}
