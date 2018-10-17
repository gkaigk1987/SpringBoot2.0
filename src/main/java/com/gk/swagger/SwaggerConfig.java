package com.gk.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger配置信息
 * @Title: SwaggerConfig.java  
 * @Package com.gk.swagger  
 * @Description: TODO
 * @author GK 
 * @date 2018年10月17日
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Spring Boot 2 示例系统")
				.description("SpringBoot2 MyBatis ElasticSearch Thymeleaf")
				.termsOfServiceUrl("https://github.com/gkaigk1987")
				.contact("gkaigk@126.com")
				.version("1.0")
				.build();
	}
	
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.gk.controller"))
				.paths(PathSelectors.any())
				.build();
	}

}
