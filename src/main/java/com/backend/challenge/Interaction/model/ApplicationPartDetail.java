package com.backend.challenge.Interaction.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Data
@NoArgsConstructor
@Embeddable
public class ApplicationPartDetail {


    @JsonProperty("FilePN")
    private String fileName;

    @JsonProperty("FrozenStatus")
    private String frozenStatus;

    @JsonProperty("SuccessorPartNumber")
    private String successorPartNumber;

    @Embedded
    @JsonProperty("MGMFile")
    private MGMFile mgmFile;

    @JsonProperty("Version")
    private String version;

    @JsonProperty("RunTimeSize")
    private String runTimeSize;

}
