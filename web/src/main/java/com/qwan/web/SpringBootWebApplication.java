package com.qwan.web;

import com.qwan.foundation.uconfig.UConfigInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Administrator on 2018/4/1.
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:META-INF/spring/*.spring.xml"})
public class SpringBootWebApplication extends SpringBootServletInitializer
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
    {
        addInitializers(builder);
        return builder.sources(SpringBootWebApplication.class);
    }

    public static void main(String[] args)
        throws Exception
    {
        SpringApplication application = new SpringApplication(SpringBootWebApplication.class);
        application.addInitializers();
        application.run(args);
    }

    private static void addInitializers(SpringApplicationBuilder builder)
    {
        builder.initializers(new UConfigInitializer());
    }
}
