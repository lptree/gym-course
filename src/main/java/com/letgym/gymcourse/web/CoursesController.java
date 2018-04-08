package com.letgym.gymcourse.web;
import com.letgym.gymcourse.core.Result;
import com.letgym.gymcourse.core.ResultGenerator;
import com.letgym.gymcourse.model.Courses;
import com.letgym.gymcourse.service.CoursesService;
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
@RequestMapping("/courses")
public class CoursesController {
    @Resource
    private CoursesService coursesService;

    @PostMapping("/add")
    public Result add(Courses courses) {
        coursesService.save(courses);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        coursesService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Courses courses) {
        coursesService.update(courses);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Courses courses = coursesService.findById(id);
        return ResultGenerator.genSuccessResult(courses);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Courses> list = coursesService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
