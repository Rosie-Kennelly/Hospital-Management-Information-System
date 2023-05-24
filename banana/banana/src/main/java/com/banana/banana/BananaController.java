package com.banana.banana;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// Importing required classes
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banana.banana.models.ConsentForm;

@Controller
// @EnableJpaRepositories(basePackages = "com.banana.banana.repository")
@RequestMapping("/")
public class BananaController {

    private final BananaService bananaService;

    public BananaController(BananaService bananaService) {
        this.bananaService = bananaService;
    }

    @GetMapping("/ice_cream")
    public String ice_cream() {
        return "ice_cream";
    }

    @GetMapping("/consent")
    public String consent() {
        return "consent";
    }

    @PostMapping("/consent/submit-form")
    public String consentSubmit(@ModelAttribute ConsentForm consentForm) {

        consentForm.setDateSigned(LocalDate.now());
        bananaService.saveConsentForm(consentForm);

        return "success";
    }
}
