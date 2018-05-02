package com.letgym.gymcourse.web;
import com.letgym.gymcourse.core.Result;
import com.letgym.gymcourse.core.ResultGenerator;
import com.letgym.gymcourse.model.TearcherDisplay;
import com.letgym.gymcourse.service.TearcherDisplayService;
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
@RequestMapping("/tearcher/display")
public class TearcherDisplayController {
    @Resource
    private TearcherDisplayService tearcherDisplayService;

    @PostMapping("/add")
    public Result add(TearcherDisplay tearcherDisplay) {
        tearcherDisplayService.save(tearcherDisplay);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        tearcherDisplayService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(TearcherDisplay tearcherDisplay) {
        tearcherDisplayService.update(tearcherDisplay);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Long id) {
        TearcherDisplay tearcherDisplay = tearcherDisplayService.findById(id);
        return ResultGenerator.genSuccessResult(tearcherDisplay);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TearcherDisplay> list = tearcherDisplayService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
