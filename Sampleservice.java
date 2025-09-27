package com.serviceapi.servicedataimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviceapi.model.primary.Sample;
import com.serviceapi.primary.repository.SampleRepository;



@Service
public class Sampleservice {
	
	@Autowired
	private  SampleRepository sampleRepository;

    public Sample addsample (Sample sample) {
    	  return  sampleRepository.save(sample);
     }
    
    public void deleteByid(int inx_no) {
        if (sampleRepository.existsById(inx_no)) {
            sampleRepository.deleteById(inx_no);
        } else {
            throw new RuntimeException("Sample not found with ID: " + inx_no);
        }
    }
    public List<Sample> getsample() {
        return sampleRepository.findAll();
    }
    public Sample getById( int inx_no){
    	 return sampleRepository.findById(inx_no).orElse(null);
     }
    
    
}