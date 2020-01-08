package com.dxw.springbootswagger.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
//    @Value("${swagger.enabled}")
//    private boolean swaggerEnabled;

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                // 是否开启
                .enable(true)
                .select()
                // 扫描的路径包
                .apis(RequestHandlerSelectors.basePackage("com.dxw.springbootswagger.controller"))
                // 指定路径处理PathSelectors.any()代表所有的路径
                .paths(PathSelectors.any())
                .build();
    }

    //自己想展示的一些信息
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpringBoot集成和使用Swagger2-demo示例")
                .description("yb")
                // 作者信息
                .contact(new Contact("段段", "https://blog.csdn.net/yhahaha", "84137863@qq.com"))
                .version("1.0.0")
                .build();
    }
}
