package com.banana.banana;

import java.time.LocalDate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @GetMapping("/")
    public String index() {
        return "login";
    }

    @PostMapping("/consent/submit-form")
    public String consentSubmit(@ModelAttribute ConsentForm consentForm) {

        consentForm.setDateSigned(LocalDate.now());
        bananaService.saveConsentForm(consentForm);

        return "success";
    }

    @GetMapping("/failure")
    public String failure() {
        return "failure";
    }



    // @PostMapping("/consent/submit-form")
    // public String consentSubmit(@ModelAttribute ConsentForm consentForm) {
    //     // save consentForm to database
    //     consentForm.setDateSigned(LocalDate.now());
    //     consentFormRepository.save(consentForm);
    //     // consentForm.save(

    //     return "success";
    // }
}
