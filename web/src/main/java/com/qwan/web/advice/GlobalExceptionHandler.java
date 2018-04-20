/*
 * 文件名：GlobalExceptionHandler.java
 * 版权：Copyright 2018-2020 foundation Tech. Co. Ltd. All Rights Reserved. 
 * 描述： GlobalExceptionHandler.java
 * 修改人：Administrator
 * 修改时间：2018/4/14
 */
package com.qwan.web.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

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
 * @version foundation V001R001 2018/4/14
 */
@ControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public String handleException(Exception e)
    {
        // for exception details.
        e.printStackTrace();
        return e.getMessage();
    }
}
