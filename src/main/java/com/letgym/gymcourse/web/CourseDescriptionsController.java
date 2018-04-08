package com.letgym.gymcourse.web;
import com.letgym.gymcourse.core.Result;
import com.letgym.gymcourse.core.ResultGenerator;
import com.letgym.gymcourse.model.CourseDescriptions;
import com.letgym.gymcourse.service.CourseDescriptionsService;
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
@RequestMapping("/course/descriptions")
public class CourseDescriptionsController {
    @Resource
    private CourseDescriptionsService courseDescriptionsService;

    @PostMapping("/add")
    public Result add(CourseDescriptions courseDescriptions) {
        courseDescriptionsService.save(courseDescriptions);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        courseDescriptionsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(CourseDescriptions courseDescriptions) {
        courseDescriptionsService.update(courseDescriptions);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        CourseDescriptions courseDescriptions = courseDescriptionsService.findById(id);
        return ResultGenerator.genSuccessResult(courseDescriptions);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<CourseDescriptions> list = courseDescriptionsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
