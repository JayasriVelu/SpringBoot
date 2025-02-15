package com.example.Swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Config {
@Bean
public Docket Api()
{
return new Docket(DocumentationType.SWAGGER_2).select()
.apis(RequestHandlerSelectors.basePackage("com.example.Swagger"))
.paths(PathSelectors.any()).build();
}


}