package code.backend.challenge;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import code.backend.challenge.models.ApplicationDetail;
import code.backend.challenge.models.Root;
import code.backend.challenge.service.ApplicationPartService;

@SpringBootApplication
public class BackendCodeChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendCodeChallengeApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(ApplicationPartService applicationPartService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/JSONResponse.json");
			try {
				
				Root r = mapper.readValue(inputStream,Root.class);
				List<ApplicationDetail> details = r.getApplicationDetail();
							
				applicationPartService.save(details);
			} catch (IOException e){
				System.out.println("Unable to save details: " + e.getMessage());
			}
	    };
	}

}
