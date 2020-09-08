package code.backend.challenge.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import code.backend.challenge.models.ApplicationDetail;
import code.backend.challenge.models.ApplicationRequest;
import code.backend.challenge.models.Root;
import code.backend.challenge.service.ApplicationPartService;

@RestController
@RequestMapping("/applicationDetails")
public class ApplicationPartController {
	@Autowired
	private ApplicationPartService applicationPartService;
	
	  @GetMapping("/list")
	    public ResponseEntity<Root> list() {
	        return ResponseEntity.ok().body(applicationPartService.list());
	       // return applicationPartService.list();
	    }
	  
	  @GetMapping("/getInfo/{FilePN}/{SubType}")
	  public Root getInformation(@PathVariable("FilePN") String FilePN,@PathVariable("SubType") String SubType) {
	        return applicationPartService.getInformation(FilePN, SubType);
	    }
	  @GetMapping("/getInfo")
	  public ResponseEntity<Root> getInfo(@RequestBody ApplicationRequest applicationRequest) {
		  String FilePN = applicationRequest.getFilePN();
		  String SubType = applicationRequest.getSubType();
	        return ResponseEntity.ok().body(applicationPartService.getInformation(FilePN, SubType));
	        //return applicationPartService.getInformation(FilePN, SubType);
	    }

}
