package com.letgym.gymcourse.web;
import com.letgym.gymcourse.core.Result;
import com.letgym.gymcourse.core.ResultGenerator;
import com.letgym.gymcourse.model.User;
import com.letgym.gymcourse.model.custom.UserDTO;
import com.letgym.gymcourse.model.custom.UserDetailInfo;
import com.letgym.gymcourse.model.mapper.User2UserDTOMapper;
import com.letgym.gymcourse.service.UserService;
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
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/add")
    public Result add(User user) {
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Long id) {
        User user = null;
        try {
            user = userService.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

        //转换为UserDTO
        UserDTO userDTO = User2UserDTOMapper.MAPPER.User2UserDTO(user);


        return ResultGenerator.genSuccessResult(userDTO);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();

        //转换为UserDTO
        List<UserDTO> listDTO = User2UserDTOMapper.MAPPER.User2UserDTOs(list);


        PageInfo pageInfo = new PageInfo(listDTO);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/userDetail")
    public Result userDetail(@RequestParam Integer id) {
        UserDetailInfo user = userService.getUserDetailInfo(id);
        return ResultGenerator.genSuccessResult(user);
    }
}
