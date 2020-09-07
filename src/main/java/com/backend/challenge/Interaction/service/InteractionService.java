package com.backend.challenge.Interaction.service;

import com.backend.challenge.Interaction.Exception.FileDetailsNotFoundException;
import com.backend.challenge.Interaction.model.FileDetails;
import com.backend.challenge.Interaction.repository.FileDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class InteractionService {

    @Autowired
    FileDetailsRepository fileDetailsRepository;

    public FileDetails getFileDetails(String fileName, String type) {
        FileDetails response = fileDetailsRepository.findFileDetailsByTypeAndApplicationPartDetailFileName(type,fileName);
        if(null != response && !StringUtils.isEmpty(response.getType()))
            return response;
        else
            throw new FileDetailsNotFoundException("Requested file does not exists");

    }
}
