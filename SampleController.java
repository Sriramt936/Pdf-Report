package com.serviceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serviceapi.model.primary.Jobentry;
import com.serviceapi.model.primary.Sample;
import com.serviceapi.servicedataimp.Sampleservice;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class SampleController {
    @Autowired
    private Sampleservice sampleservice;
	@GetMapping("/all")
	public List<Sample> getSample(){
	 return  sampleservice.getsample();
	
	}
	 @GetMapping("/get/{inx_no}")
	    public Sample getSampleById(@PathVariable int inx_no) {
	        return sampleservice.getById(inx_no);
	    }
	@PostMapping("/save")
	  public Sample saveSample(@RequestBody Sample sample) {
		return sampleservice.addsample(sample);
	}
	@DeleteMapping("/delete/{inx_no}")
	public ResponseEntity<String> deleteById(@PathVariable int inx_no) {
	    sampleservice.deleteByid(inx_no);
	    return ResponseEntity.ok("Sample deleted with ID: " + inx_no);
	}
}  
