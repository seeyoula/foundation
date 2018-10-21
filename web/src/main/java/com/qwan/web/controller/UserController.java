/*
 * 文件名：UserController.java
 * 版权：Copyright 2018-2020 foundation Tech. Co. Ltd. All Rights Reserved. 
 * 描述： UserController.java
 * 修改人：Administrator
 * 修改时间：2018/5/7
 */
package com.qwan.web.controller;

import com.qwan.web.dao.UserDao;
import com.qwan.web.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * <pre>
 * </pre>
 *
 * @author Administrator
 * @version foundation V001R001 2018/5/7
 */
@RestController
@RequestMapping(value = "/user")
public class UserController
{
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/get")
    public User getUser()
    {
        return userDao.getUserById(1);
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(User user)
    {
        System.out.println(user);
        return "";
    }
}
