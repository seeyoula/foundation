package com.sbs.common.web.controller;

import com.sbs.common.web.bean.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/1.
 */
@RestController
public class IndexController {

    @Autowired
    private TestBean testBean;

    @RequestMapping("/")
    public String index() {
        return "Hello world!!!";
    }
}
