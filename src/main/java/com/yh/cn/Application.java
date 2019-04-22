package com.yh.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 应用启动类
 */
@SpringBootApplication
//@ServletComponentScan
//@EnableCaching
//@EnableAsync
//@EnableScheduling
//禁用springboot默认加载数据源配置
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@EnableOAuth2Sso
public class Application
        /*extends SpringBootServletInitializer*/ {

   /* @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }*/
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
