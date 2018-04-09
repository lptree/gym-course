package com.letgym.gymcourse.service.impl;

import com.letgym.gymcourse.dao.CourseDescriptionsMapper;
import com.letgym.gymcourse.model.CourseDescriptions;
import com.letgym.gymcourse.service.CourseDescriptionsService;
import com.letgym.gymcourse.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/02.
 */
@Service
@Transactional
public class CourseDescriptionsServiceImpl extends AbstractService<CourseDescriptions> implements CourseDescriptionsService {
    @Resource
    private CourseDescriptionsMapper courseDescriptionsMapper;

}