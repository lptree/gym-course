package com.letgym.gymcourse.service.impl;

import com.letgym.gymcourse.dao.CourseSchedulesMapper;
import com.letgym.gymcourse.model.CourseSchedules;
import com.letgym.gymcourse.service.CourseSchedulesService;
import com.letgym.gymcourse.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/02.
 */
@Service
@Transactional
public class CourseSchedulesServiceImpl extends AbstractService<CourseSchedules> implements CourseSchedulesService {
    @Resource
    private CourseSchedulesMapper courseSchedulesMapper;

}
