package com.hdl.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration(value = "src/main/webapp")
//@ContextConfiguration("file:src/main/webapp/W")
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
public class DemoControllerTest {
    
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void test() throws Exception {
        String actual = "{\"orderNumber\": \"4955\",\"orderVersion\": \"1\"}";
        String expect = "{\"orderNumber\": \"4956\",\"orderVersion\": \"1\"}";
        
       this.mockMvc
            .perform(post("/jsonCompare")
                     .accept(MediaType.APPLICATION_JSON)
               .param("actual", actual)
               .param("expect", expect))
               .andDo(print())
               .andExpect(status().isOk())
               .andExpect(content().contentType("application/json"))
               .andExpect(jsonPath("$", hasSize(1)))
               .andExpect(jsonPath("$[0].field").value("orderNumber"))
               .andExpect(jsonPath("$[0].actual").value("4955"))
               .andExpect(jsonPath("$[0].expected").value("4956"));
    }
}