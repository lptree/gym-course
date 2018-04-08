package com.letgym.gymcourse.web;
import com.letgym.gymcourse.core.Result;
import com.letgym.gymcourse.core.ResultGenerator;
import com.letgym.gymcourse.model.CourseScheduleMembers;
import com.letgym.gymcourse.service.CourseScheduleMembersService;
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
@RequestMapping("/course/schedule/members")
public class CourseScheduleMembersController {
    @Resource
    private CourseScheduleMembersService courseScheduleMembersService;

    @PostMapping("/add")
    public Result add(CourseScheduleMembers courseScheduleMembers) {
        courseScheduleMembersService.save(courseScheduleMembers);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        courseScheduleMembersService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(CourseScheduleMembers courseScheduleMembers) {
        courseScheduleMembersService.update(courseScheduleMembers);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        CourseScheduleMembers courseScheduleMembers = courseScheduleMembersService.findById(id);
        return ResultGenerator.genSuccessResult(courseScheduleMembers);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<CourseScheduleMembers> list = courseScheduleMembersService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
