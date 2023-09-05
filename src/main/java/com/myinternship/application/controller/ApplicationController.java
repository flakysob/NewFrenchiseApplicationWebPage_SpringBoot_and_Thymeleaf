package com.myinternship.application.controller;

import com.myinternship.application.model.ModelOfApplication;
import com.myinternship.application.service.ApplicationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApplicationController {

    private ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    private boolean checkIfIdExists(String id) {
        // Veritabanında veya başka bir kaynakta ID kontrolü yapabilirsiniz
        // Bu sadece örnek bir metoddur
        return false; // Eğer ID mevcutsa true dönmelidir
    }


    @PostMapping("/home")
    public String addApp(Model model, ModelOfApplication modelOfApplication){
        int result = applicationService.addApplication(modelOfApplication);
        if(result < 1)
        {
            model.addAttribute("errorMessage", String.format("%s kişisinin başvurusu eklenemedi.", modelOfApplication.getName()));
        }
        model.addAttribute("successMessage", String.format("%s kişisinin başvurusu eklendi.", modelOfApplication.getName()));

        ModelOfApplication[] modelOfApplications = applicationService.getApplications();
        model.addAttribute("modelOfApplications", modelOfApplications);

        return "home";
    }

    @GetMapping("/home")
    public String getApp(Model model, ModelOfApplication modelOfApplication){
        model.addAttribute("message","Application");

        ModelOfApplication[] modelOfApplications = applicationService.getApplications();
        model.addAttribute("modelOfApplications", modelOfApplications);
        return "home";
    }
}
