package code.backend.challenge;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import code.backend.challenge.controller.ApplicationPartController;
import code.backend.challenge.service.ApplicationPartService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = ApplicationPartController.class)
@WithMockUser
@SpringBootTest
public class ApplicationControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ApplicationPartService appService;

	@Test
	public void getDetails() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/list")).andExpect(status().isOk())
		.andExpect(jsonPath("SubType").value("Application1"));
		
	}
}
