package code.backend.challenge;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import code.backend.challenge.controller.ApplicationPartController;
import code.backend.challenge.models.ApplicationDetail;
import code.backend.challenge.models.ApplicationPartDetail;
import code.backend.challenge.models.Root;
import code.backend.challenge.service.ApplicationPartService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = ApplicationPartController.class)
//@WithMockUser
//@SpringBootTest
public class ApplicationControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ApplicationPartService appService;

	@Test
	public void getDetails() throws Exception{
		ApplicationDetail a = new ApplicationDetail();
		a.setSubType("Application1");
		ApplicationDetail a1 = new ApplicationDetail();
		a1.setSubType("Application2");
		List<ApplicationDetail> l = Arrays.asList(a,a1);
		
		when(appService.list()).thenReturn(new Root(l));
		
		System.out.println("Result :" + mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8088/applicationDetails/list")).andDo(print()).andReturn().getResponse().getContentAsString());
		mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8088/applicationDetails/list")).andExpect(status().isOk())
		 //.andExpect(jsonPath("$.ApplicationDetail").isNotEmpty());
		.andExpect(jsonPath("ApplicationDetail[1].SubType").value(a1.getSubType()));
		//.andExpect(jsonPath("SubType").value("Application1"));
		
	}
	
	@Test
	public void getDetailsForFilePNAndSubType() throws Exception{
		ApplicationDetail a = new ApplicationDetail();
		ApplicationPartDetail p = new ApplicationPartDetail();
		a.setSubType("Application1");
		p.setFilePN("SA-11-TT");
		a.setApplicationPartDetail(p);
		/*ApplicationDetail a1 = new ApplicationDetail();
		a1.setSubType("Application2");
		a1.getApplicationPartDetail().setFilePN("VA-16-AA");*/
		List<ApplicationDetail> l = Arrays.asList(a);
		
		when(appService.getInformation("SA-11-TT", "Application1")).thenReturn(new Root(l));
		
		System.out.println("Result :" + mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8088/applicationDetails/getInfo/"+"SA-11-TT/"+"Application1"))
		.andDo(print()).andReturn().getResponse().getContentAsString());
		mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8088/applicationDetails/getInfo/"+"SA-11-TT/"+"Application1")).andExpect(status().isOk())
		 //.andExpect(jsonPath("$.ApplicationDetail").isNotEmpty());
		.andExpect(jsonPath("ApplicationDetail[0].ApplicationPartDetail.FilePN").value(a.getApplicationPartDetail().getFilePN()));
		//.andExpect(jsonPath("SubType").value("Application1"));
		
	}
	
}
