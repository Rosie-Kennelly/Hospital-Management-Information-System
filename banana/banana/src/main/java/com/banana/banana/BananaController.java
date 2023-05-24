package com.banana.banana;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
// Importing required classes
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.banana.banana.models.ConsentForm;
import com.banana.banana.repository.ConsentFormRepository;

@Controller
@RequestMapping
public class BananaController {

    // @Autowired()
    // private ConsentFormRepository consentFormRepository;

    @GetMapping("/ice_cream")
    public String ice_cream() {
        return "ice_cream";
    }

    @GetMapping("/consent")
    public String consent() {
        return "consent";
    }

    @GetMapping("/success")
    public String success() {
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
