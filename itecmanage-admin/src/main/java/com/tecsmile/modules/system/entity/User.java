package com.tecsmile.modules.system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IntelliJ IDEA.
 * User: Techmile
 * Date: 2018/9/19
 * Time: 17:44
 * Description: 用户测试类
 */

@Data
public class User {

    @TableField("userid")
    private String userId;
    @TableField("username")
    private String userName;
    @TableField("userpwd")
    private String userPwd;


}
