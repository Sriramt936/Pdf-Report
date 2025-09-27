package com.serviceapi.primary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serviceapi.model.primary.Sample;

public interface SampleRepository extends JpaRepository<Sample, Integer> { 
	
}
