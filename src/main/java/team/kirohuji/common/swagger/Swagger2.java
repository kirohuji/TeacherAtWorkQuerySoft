/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.kirohuji.common.swagger;
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
 *
 * @author zyd
 */
 @Configuration
    @EnableSwagger2
    public class Swagger2 {

        @Bean
        public Docket createRestApi(){
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("team.kirohuji.controller.api"))
                    .paths(PathSelectors.any())
                    .build();
        }

        private ApiInfo apiInfo(){
            return new ApiInfoBuilder()
                    .title("Spring Boot中使用Swagger2构建RESTful APIs")
                    .description("描述")
                    .termsOfServiceUrl("http://kirohuji.team.com")
                    .version("1.0")
                    .build();
        }

    }