package com.tecsmile.modules.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tecsmile.modules.system.dal.UserMapper;
import com.tecsmile.modules.system.entity.User;
import com.tecsmile.modules.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Techmile QQ:25381503
 * Date: 2018/9/19
 * Description: 用户表相关操作
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List getList(){
        return userMapper.selectList(null);
    }

    @Override
    public List getSpecialList(){
      return userMapper.getSpecialList();
    }

}
