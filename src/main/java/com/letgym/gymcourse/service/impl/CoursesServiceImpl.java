package com.letgym.gymcourse.service.impl;

import com.letgym.gymcourse.dao.CoursesMapper;
import com.letgym.gymcourse.model.Courses;
import com.letgym.gymcourse.service.CoursesService;
import com.letgym.gymcourse.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/02.
 */
@Service
@Transactional
public class CoursesServiceImpl extends AbstractService<Courses> implements CoursesService {
    @Resource
    private CoursesMapper coursesMapper;

}
