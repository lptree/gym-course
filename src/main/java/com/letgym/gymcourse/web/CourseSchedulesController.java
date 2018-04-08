package com.letgym.gymcourse.web;
import com.letgym.gymcourse.core.Result;
import com.letgym.gymcourse.core.ResultGenerator;
import com.letgym.gymcourse.model.CourseSchedules;
import com.letgym.gymcourse.service.CourseSchedulesService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/04/02.
*/
@RestController
@RequestMapping("/course/schedules")
public class CourseSchedulesController {
    @Resource
    private CourseSchedulesService courseSchedulesService;

    @PostMapping("/add")
    public Result add(CourseSchedules courseSchedules) {
        courseSchedulesService.save(courseSchedules);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        courseSchedulesService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(CourseSchedules courseSchedules) {
        courseSchedulesService.update(courseSchedules);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        CourseSchedules courseSchedules = courseSchedulesService.findById(id);
        return ResultGenerator.genSuccessResult(courseSchedules);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<CourseSchedules> list = courseSchedulesService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
