import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

/*
 * @SpringBootTest
 * 
 * @AutoConfigureMockMvc public class PromotionControllerTest {
 * 
 * @Autowired private MockMvc mockMvc;
 * 
 * @Test public void testGetPromotions() throws Exception { String requestJson =
 * "{\"products\":[{\"id\":\"A\"},{\"id\":\"B\"},{\"id\":\"C\"},{\"id\":\"C\"},{\"id\":\"D\"}]}";
 * mockMvc.perform(post("/api/promotions")
 * .contentType(MediaType.APPLICATION_JSON) .content(requestJson))
 * .andExpect(status().isOk()) .andExpect(jsonPath("$[0].id").value("X"))
 * .andExpect(jsonPath("$[0].quantity").value(3))
 * .andExpect(jsonPath("$[1].id").value("Y"))
 * .andExpect(jsonPath("$[1].quantity").value(1)); } }
 */
