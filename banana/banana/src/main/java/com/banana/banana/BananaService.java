package com.banana.banana;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.banana.banana.models.ConsentForm;

@Service
public class BananaService {

    private final ConsentFormRepository consentFormRepository;

    @Autowired
    public BananaService(ConsentFormRepository consentFormRepository) {
        this.consentFormRepository = consentFormRepository;
    }

    @Transactional
    public void saveConsentForm(ConsentForm consentForm) {
        consentFormRepository.save(consentForm);
    }
}
