package com.backend.challenge.Interaction.Repository;

import com.backend.challenge.Interaction.model.FileDetails;
import com.backend.challenge.Interaction.repository.FileDetailsRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class FileDetailsRepositoryTest {

    @Autowired
    FileDetailsRepository fileDetailsRepository;

    @Test
    public void findFileDetails() {

       FileDetails fileDetails = fileDetailsRepository.findFileDetailsByTypeAndApplicationPartDetailFileName("Application1","SA-11-TT");
       assertThat(fileDetails.getType(),equalTo("Application1"));

    }

}
