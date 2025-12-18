package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        Server server = new Server();
        server.setUrl("https://9330.pro604cr.amypo.ai");
        server.setDescription("transport_pro server");

        return new OpenAPI()
                .info(new Info()
                        .title("Transport Pro API")
                        .version("1.0.0")
                        .description("Spring Boot APIs for transport_pro project"))
                .servers(List.of(server));
    }
}