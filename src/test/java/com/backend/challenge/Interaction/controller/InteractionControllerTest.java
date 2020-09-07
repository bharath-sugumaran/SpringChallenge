package com.backend.challenge.Interaction.controller;


import com.backend.challenge.Interaction.Exception.FileDetailsNotFoundException;
import com.backend.challenge.Interaction.model.*;
import com.backend.challenge.Interaction.service.InteractionService;
import com.backend.challenge.Interaction.utils.TestDataUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(InteractionController.class)
public class InteractionControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    InteractionService interactionService;



    @Test
    public void returnFileData() throws Exception{

        given(interactionService.getFileDetails(anyString(),anyString())).willReturn(TestDataUtils.createTestData());
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/fileDetails")
                .param("fileName","testFile").param("type","userInformation"))
                .andExpect(status().isOk())
               // .andExpect(jsonPath("SubType").value("userInformation"))
                //.andExpect(jsonPath("FilePN").value("testFile"))
        .andReturn();
        String content = result.getResponse().getContentAsString();
        System.out.println(content);
    }
    @Test
    public void fileDataNotFound() throws Exception{

        given(interactionService.getFileDetails(anyString(),anyString())).willThrow(new FileDetailsNotFoundException("Requested file details does not exist"));
        mockMvc.perform(MockMvcRequestBuilders.get("/fileDetails")
                .param("fileName","testFile").param("type","userInformation"))
                .andExpect(status().isNotFound());
    }

   }
