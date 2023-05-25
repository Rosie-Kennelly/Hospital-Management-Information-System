package com.banana.banana;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banana.banana.models.ConsentForm;

@Repository
public interface ConsentFormRepository extends JpaRepository<ConsentForm, Integer> {
}
