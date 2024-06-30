package com.geotat.starter.config;

import com.geotat.starter.ErrorHandler;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ErrorHandlerConfiguration {

    @Bean
    @ConditionalOnMissingBean
    ErrorHandler errorHandler() {
        return new ErrorHandler();
    }
}
