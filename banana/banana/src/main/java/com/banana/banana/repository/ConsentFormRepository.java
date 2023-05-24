package com.banana.banana.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.banana.banana.models.ConsentForm;

@Repository
public interface ConsentFormRepository extends CrudRepository<ConsentForm, Integer> {
}