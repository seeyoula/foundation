/*
 * 文件名：LoginController.java
 * 版权：Copyright 2018-2020 foundation Tech. Co. Ltd. All Rights Reserved. 
 * 描述： LoginController.java
 * 修改人：Administrator
 * 修改时间：2018/4/27
 */
package com.qwan.web.controller;

import com.qwan.web.domain.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
 * @version foundation V001R001 2018/4/27
 */
@RestController
public class LoginController
{
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password, String vcode, Boolean rememberMe)
    {
        System.out.println(username);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        SecurityUtils.getSubject().login(token);

        return "loginSuccess";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String home()
    {
        Subject subject = SecurityUtils.getSubject();
        User principal = (User)subject.getPrincipal();

        return "Home";
    }
}
