package com.backend.challenge.Interaction.controller;

import com.backend.challenge.Interaction.model.FileDetails;
import com.backend.challenge.Interaction.service.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InteractionController {

    @Autowired
    InteractionService interactionService;

    @RequestMapping(value ="/fileDetails",method = RequestMethod.GET)
    private FileDetails returnResponse(
            @RequestParam(value ="fileName",required = true) String file,
            @RequestParam(value ="type", required = true) String type){

        return interactionService.getFileDetails(file,type);

    }

}
