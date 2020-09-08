package code.backend.challenge;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import code.backend.challenge.controller.ApplicationPartController;
import code.backend.challenge.models.ApplicationDetail;
import code.backend.challenge.models.Root;
import code.backend.challenge.service.ApplicationPartService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//@WebMvcTest(value = ApplicationPartController.class)
//@WithMockUser
class BackendCodeChallengeApplicationTests {
	@Autowired
	  private TestRestTemplate restTemplate;
	
	@Autowired
	private ApplicationPartController applicationPartController;
	

	//@Autowired
	//private MockMvc mockMvc;

	@MockBean
	private ApplicationPartService ApplicationPartService;

	  @LocalServerPort
	  private int port = 8088;
	  
	 /* @EnableAutoConfiguration
	  private void WebsocketSourceConfiguratio() {
		  @Bean
		  ServletWebServerFactory servletWebServerFactory{
		  return new TomcatServletWebServerFactory();
		  }
			} */

	  private String getRootUrl() {
	    return "http://localhost:8088/applicationDetails";
	  }

	@Test
	void contextLoads() {
		assertThat(applicationPartController).isNotNull();
	}
	
	@Test
	public void testGetEntitycheck() {
		ResponseEntity<Root> rep = restTemplate.getForEntity(getRootUrl()+"/list", Root.class);
		System.out.println("Status Code : " + rep.getStatusCode().is2xxSuccessful() + " response : " + rep);
		assertThat(rep.getStatusCode().is2xxSuccessful());
	}
	
	@Test
    public void testGetlist() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        ResponseEntity<Root> response = restTemplate.exchange(getRootUrl() + "/list",
            HttpMethod.GET, entity, Root.class);
        System.out.println("//Response :" + response.getBody().getApplicationDetail().get(0).getSubType());
        //Assertions.assertThat(response.getStatusCode().is2xxSuccessful());
        Assertions.assertThat(response.getBody()).isNotNull();
    }
	
	@Test
	  public void testGetDetailsByFilePNAndSubType() {
	    ApplicationDetail detail = restTemplate.getForObject(getRootUrl() + "/getInfo/SA-11-TT/Application1", ApplicationDetail.class);
	    System.out.println(detail.getSubType());
	    Assertions.assertThat(detail).isNotNull();
	  }

}
