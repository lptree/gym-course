package com.letgym.gymcourse.dao;

import com.letgym.gymcourse.core.Mapper;
import com.letgym.gymcourse.model.CourseDescriptions;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface CourseDescriptionsMapper extends Mapper<CourseDescriptions> {

    @Select("select * from course_descriptions where courseid=#{courseid}")
    List<CourseDescriptions> getCourseDescriptionsListByCourseId(int courseid);
}