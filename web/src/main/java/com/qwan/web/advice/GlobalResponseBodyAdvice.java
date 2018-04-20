/*
 * 文件名：GlobalResponseBodyAdvice.java
 * 版权：Copyright 2018-2020 foundation Tech. Co. Ltd. All Rights Reserved. 
 * 描述： GlobalResponseBodyAdvice.java
 * 修改人：Administrator
 * 修改时间：2018/4/14
 */
package com.qwan.web.advice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

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
public class GlobalResponseBodyAdvice implements ResponseBodyAdvice
{
    @Value("${qwan.web.global.response.enabled:true}")
    private boolean globalResponseEnabled;

    @Value("${qwan.web.global.response.whitelist}")
    private String globalResponseWhiteList;

    /**
     * Whether this component supports the given controller method return type
     * and the selected {@code HttpMessageConverter} type.
     *
     * @param returnType    the return type
     * @param converterType the selected converter type
     * @return {@code true} if {@link #beforeBodyWrite} should be invoked;
     * {@code false} otherwise
     */
    @Override
    public boolean supports(MethodParameter returnType, Class converterType)
    {
        return globalResponseEnabled;
    }

    /**
     * Invoked after an {@code HttpMessageConverter} is selected and just before
     * its write method is invoked.
     *
     * @param body                  the body to be written
     * @param returnType            the return type of the controller method
     * @param selectedContentType   the content type selected through content negotiation
     * @param selectedConverterType the converter type selected to write to the response
     * @param request               the current request
     * @param response              the current response
     * @return the body that was passed in or a modified (possibly new) instance
     */
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
        Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response)
    {
        // deal with body
        return body;
    }
}
