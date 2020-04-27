package com.moviedatabase.gatewayserver;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {
    @Bean
    public RouteLocator getRoutes(RouteLocatorBuilder builder){
        return builder.routes().route(
                r-> r.path("/movie/**").uri("lb://movie-service").id("movieService")
        ).build();
    }
}
