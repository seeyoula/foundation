package com.qwan.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController
{
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
