package com.example.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/api/**"))
                .apis(RequestHandlerSelectors.basePackage("com.example.demo2"))
                .build();
    }

    //api docs link: http://localhost:8080/swagger-ui.html#/

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "REST API Result d.o.o", //title
                "Testni projekt podjetje Result d.o.o", //description
                "Version 1.0", //version
                "Terms of service", //terms of service URL
                new Contact("Dino Celikovic", "https://github.com/whiteduke3", "dino.celikovic@gmail.com"),
                "License of API", "API license URL", Collections.emptyList()); // contact info
    }
}