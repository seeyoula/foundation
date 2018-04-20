package com.qwan.web.controller;

import com.qwan.web.bean.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/1.
 */
@RestController
public class IndexController
{
    @Autowired
    private TestBean testBean;

    @RequestMapping("/")
    public String index()
    {
        return "Hello world!!!";
    }

    @RequestMapping("/exception")
    public String exceptionTest()
    {
        throw new RuntimeException("This is a Exception test...");
    }
}
