package com.myinternship.application.controller;

import com.myinternship.application.model.ModelOfApplication;
import com.myinternship.application.service.ApplicationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TableController {

    private ApplicationService applicationService;

    public TableController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }


    @GetMapping("/getall")
    public String getApp(Model model, ModelOfApplication modelOfApplication){
        model.addAttribute("message","Application");

        ModelOfApplication[] modelOfApplications = applicationService.getApplications();
        model.addAttribute("modelOfApplications", modelOfApplications);
        return "getApps";
    }

}
