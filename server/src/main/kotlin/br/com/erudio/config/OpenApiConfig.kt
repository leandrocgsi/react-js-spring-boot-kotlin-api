package br.com.erudio.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenApiConfig {

    @Bean
    fun customOpenApi(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("REST API RESTful from Zero to AWS with Kotlin 1.9.10 and Spring Boot 3.2.0")
                    .version("v1")
                    .description("Some description about your API.")
                    .termsOfService("https://pub.erudio.com.br/meus-cursos")
                    .license(
                        License().name("Apache 2.0")
                            .url("https://pub.erudio.com.br/kr/blog_rest_spring_kotlin")
                    )
            )
    }
}