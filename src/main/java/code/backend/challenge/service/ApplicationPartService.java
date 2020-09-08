package code.backend.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.backend.challenge.models.ApplicationDetail;
import code.backend.challenge.models.Root;
import code.backend.challenge.repository.ApplicationPartRepository;

@Service
public class ApplicationPartService {
	@Autowired
	private ApplicationPartRepository applicationPartRepository;
	

	/*public Root getInformation(String FilePN,String SubType) {
		Root r = new Root();
		List<ApplicationDetail> itr = applicationPartRepository.findAll();
		List<ApplicationDetail> i = itr.stream().filter(a -> a.getSubType().equalsIgnoreCase(SubType) && a.getApplicationPartDetail().getFilePN().equalsIgnoreCase(FilePN))
				.collect(Collectors.toList());
		if(i.size() != 0) {
			 r = new Root(i);
		}
		return r;
    }*/
	public Root getInformation(String FilePN,String SubType) {
		Root r = new Root();
		List<ApplicationDetail> itr = applicationPartRepository.FindAllWithFilePNAndSubType(FilePN, SubType);
		if(itr.size() != 0) {
			 r = new Root(itr);
		}
		return r;
    }
	
	public Root list() {
		List<ApplicationDetail> itr = applicationPartRepository.findAll();
		Root r = new Root(itr);
		return r;
    }

    public ApplicationDetail save(ApplicationDetail applicationDetails) {
        return applicationPartRepository.save(applicationDetails);
 
    }
  
    public void save(List<ApplicationDetail> applicationDetails) {
    	Iterable<ApplicationDetail> itr= applicationPartRepository.saveAll(applicationDetails);
    	applicationPartRepository.saveAll(applicationDetails);  	
    }
   
}
