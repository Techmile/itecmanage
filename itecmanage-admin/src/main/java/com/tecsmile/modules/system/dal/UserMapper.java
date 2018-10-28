package com.tecsmile.modules.system.dal;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tecsmile.modules.system.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Techmile
 * Date: 2018/9/19
 * Time: 17:42
 * Description:
 */

public interface UserMapper extends BaseMapper<User> {

    List getSpecialList();
}
