package io.codealpha.devops.controller;

import io.codealpha.devops.model.ApplicationInfo;
import io.codealpha.devops.service.ApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final ApplicationService applicationService;

    public HomeController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/")
    public String home() {
        return "CodeAlpha DevOps Showcase API";
    }
}
