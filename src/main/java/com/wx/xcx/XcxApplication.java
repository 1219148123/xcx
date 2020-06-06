package com.wx.xcx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@MapperScan("com.wx.xcx.mapper")
@SpringBootApplication
@EnableSwagger2
public class XcxApplication {
    protected static final Logger logger = LoggerFactory.getLogger(XcxApplication.class);

    public static void main(String[] args) {
        logger.info("项目开始加载");
        SpringApplication.run(XcxApplication.class, args);
        logger.info("项目加载完毕");
    }

}
