package com.company.project.automation.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySources({
        @PropertySource("default.properties"),
        @PropertySource(value= "${spring.profiles.active}/test.properties",ignoreResourceNotFound = true)
}
)
@ComponentScan("com.company.project.automation")
public class ServiceConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer test = new PropertySourcesPlaceholderConfigurer();
        test.setIgnoreUnresolvablePlaceholders(false);
        return test;
    }
}
