package com.tecsmile.modules.system.controller;

import com.alibaba.fastjson.JSON;
import com.tecsmile.modules.system.service.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Techmile QQ:25381503
 * Date: 2018/9/19
 * Description: 用户相关处理
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("user/list")
    @ApiOperation(value = "管理员上传")
    public String getUserList() {
        List list = userService.getList();

        return JSON.toJSONString(list);
    }

    @PostMapping("user/specialList")
    @ApiOperation(value = "获取列表")
    public String getSpecialList() {
        List list = userService.getSpecialList();
        return JSON.toJSONString(list);
    }

    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
}
