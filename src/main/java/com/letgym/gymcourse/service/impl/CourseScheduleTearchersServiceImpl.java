package com.letgym.gymcourse.service.impl;

import com.letgym.gymcourse.dao.CourseScheduleTearchersMapper;
import com.letgym.gymcourse.model.CourseScheduleTearchers;
import com.letgym.gymcourse.service.CourseScheduleTearchersService;
import com.letgym.gymcourse.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/02.
 */
@Service
@Transactional
public class CourseScheduleTearchersServiceImpl extends AbstractService<CourseScheduleTearchers> implements CourseScheduleTearchersService {
    @Resource
    private CourseScheduleTearchersMapper courseScheduleTearchersMapper;

}
