package com.airline;
/*
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.airline.model.FlightRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
*/
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {FlightFinderTest.class })
@WebAppConfiguration
@EnableWebMvc*/
public class FlightFinderTest {

   /* private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testCreationOfANewProjectSucceeds() throws Exception {
        FlightRequest flightRequest = new FlightRequest();
        flightRequest.setFromCity("SFO");
        flightRequest.setToCity("NYC");
        flightRequest.setTravelDate("10/10/2018");
        String json = new ObjectMapper().writeValueAsString(flightRequest);

        mockMvc.perform(MockMvcRequestBuilders.post("/get/flights")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json));
    }*/

}