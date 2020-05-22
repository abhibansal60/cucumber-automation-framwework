package com.company.project.automation.world;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ResourceWorld {
    @Value("${app.base.url}")
    private String baseURL;

    public String getBaseURL() {
        return baseURL;
    }
}
