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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/04/02.
*/
@RestController
@RequestMapping("/course/descriptions")
@Api("swaggerDemoController相关的api")
public class CourseDescriptionsController {
    @Resource
    private CourseDescriptionsService courseDescriptionsService;

    @ApiOperation(value = "增加课程", notes = " ")
    @ApiImplicitParam(name = "courseDescriptions", value = "课程信息实体", paramType = "body", required = true, dataType = "CourseDescriptions")
    @PostMapping("/add")
    public Result add(@RequestBody CourseDescriptions courseDescriptions) {
        courseDescriptionsService.save(courseDescriptions);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "删除课程", notes = " ")
    @ApiImplicitParam(name = "id", value = "课程ID", paramType = "query", required = true, dataType = "Integer")
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        courseDescriptionsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "更新课程", notes = "")
    @ApiImplicitParam(name = "courseDescriptions", value = "课程信息实体", paramType = "query", required = true, dataType = "CourseDescriptions")
    @PostMapping("/update")
    public Result update(CourseDescriptions courseDescriptions) {
        courseDescriptionsService.update(courseDescriptions);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "课程详情", notes = "")
    @ApiImplicitParam(name = "id", value = "课程ID", paramType = "query", required = true, dataType = "Integer")
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        CourseDescriptions courseDescriptions = courseDescriptionsService.findById(id);
        return ResultGenerator.genSuccessResult(courseDescriptions);
    }

    @ApiOperation(value = "课程列表", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页数", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "size", value = "页尺寸", required = true, dataType = "Integer")
    })
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<CourseDescriptions> list = courseDescriptionsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/getCourseDescriptionsListByCourseId")
    public Result getCourseDescriptionsListByCourseId(@RequestParam Integer courserId) {
        List<CourseDescriptions> list = courseDescriptionsService.getCourseDescriptionsListByCourseId(courserId);
        return ResultGenerator.genSuccessResult(list);
    }

}
