package com.myinternship.application.controller;

import com.myinternship.application.model.ModelOfApplications;
import com.myinternship.application.service.ApplicationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    private ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/home")
    public String getHome(Model model){
        model.addAttribute("message","Application");

        ModelOfApplications[] modelOfApplications = applicationService.getApplications();
        model.addAttribute("modelOfApplications",modelOfApplications);
        return "home";
    }
}
