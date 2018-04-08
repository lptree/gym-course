package com.letgym.gymcourse.web;
import com.letgym.gymcourse.core.Result;
import com.letgym.gymcourse.core.ResultGenerator;
import com.letgym.gymcourse.model.CourseScheduleTearchers;
import com.letgym.gymcourse.service.CourseScheduleTearchersService;
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
@RequestMapping("/course/schedule/tearchers")
public class CourseScheduleTearchersController {
    @Resource
    private CourseScheduleTearchersService courseScheduleTearchersService;

    @PostMapping("/add")
    public Result add(CourseScheduleTearchers courseScheduleTearchers) {
        courseScheduleTearchersService.save(courseScheduleTearchers);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        courseScheduleTearchersService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(CourseScheduleTearchers courseScheduleTearchers) {
        courseScheduleTearchersService.update(courseScheduleTearchers);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        CourseScheduleTearchers courseScheduleTearchers = courseScheduleTearchersService.findById(id);
        return ResultGenerator.genSuccessResult(courseScheduleTearchers);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<CourseScheduleTearchers> list = courseScheduleTearchersService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
