package com.backend.challenge.Interaction.service;

import com.backend.challenge.Interaction.Exception.FileDetailsNotFoundException;
import com.backend.challenge.Interaction.model.FileDetails;
import com.backend.challenge.Interaction.repository.FileDetailsRepository;
import com.backend.challenge.Interaction.utils.TestDataUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class InteractionServiceTest {
    @Mock
    FileDetailsRepository fileDetailsRepository;

    @InjectMocks
    InteractionService interactionService;

    @Test
    public void getFileDetails() throws Exception {

        given(fileDetailsRepository.findFileDetailsByTypeAndApplicationPartDetailFileName(anyString(),anyString())).willReturn(TestDataUtils.createTestData());
        FileDetails fileDetailsInfo = interactionService.getFileDetails("SA-11-TT","Application1");
        assertThat(fileDetailsInfo.getApplicationPartDetail().getFileName(),equalTo("SA-11-TT"));
        assertThat(fileDetailsInfo.getType(),equalTo("Application1"));

    }

    @Test(expected = FileDetailsNotFoundException.class)
    public void fileDetailsNotFound() throws Exception {
        given(fileDetailsRepository.findFileDetailsByTypeAndApplicationPartDetailFileName(anyString(),anyString())).willReturn(null);

    }

}
