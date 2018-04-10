package com.letgym.gymcourse.service;
import com.letgym.gymcourse.model.CourseDescriptions;
import com.letgym.gymcourse.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/04/02.
 */
public interface CourseDescriptionsService extends Service<CourseDescriptions> {

    List<CourseDescriptions> getCourseDescriptionsListByCourseId(int courseid);
}

