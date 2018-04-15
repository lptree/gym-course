package com.letgym.gymcourse.service.impl;

import com.letgym.gymcourse.dao.CourseDescriptionsMapper;
import com.letgym.gymcourse.model.CourseDescriptions;
import com.letgym.gymcourse.service.CourseDescriptionsService;
import com.letgym.gymcourse.core.AbstractService;
//import com.lptree.utils.TestUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by CodeGenerator on 2018/04/02.
 */
@Service
@Transactional
public class CourseDescriptionsServiceImpl extends AbstractService<CourseDescriptions> implements CourseDescriptionsService {

    //private static final Logger mongoLog = LoggerFactory.getLogger("MyMongoDB");
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private CourseDescriptionsMapper courseDescriptionsMapper;

    @Override
    public List<CourseDescriptions> getCourseDescriptionsListByCourseId(int courseid)
    {
        //logger.info("开始getCourseDescriptionsListByCourseId...");
        logger.info("{title:'getCourseDescriptionsListByCourseId',message:'开始getCourseDescriptionsListByCourseId...'}");

        //TestUtils.HelloJars();

        List<CourseDescriptions> result = null;
        try {
            result = courseDescriptionsMapper.getCourseDescriptionsListByCourseId(courseid);

            if (result == null) result = new ArrayList<>();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        logger.info("{title:'getCourseDescriptionsListByCourseId',message:'结束getCourseDescriptionsListByCourseId...'}");

        //logger.info("结束getCourseDescriptionsListByCourseId...");
        return result;
    }
}
