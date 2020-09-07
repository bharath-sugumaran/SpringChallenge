package com.backend.challenge.Interaction.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class FileDetails {

    @Id
    @JsonProperty("SubType")
    private String type ;

    @OneToMany(mappedBy = "fileDetails")
    @JsonProperty("Values")
    private List<Values> values ;

    @JsonProperty("ApplicationPartDetail")
    private ApplicationPartDetail applicationPartDetail;

    @JsonProperty("ApplicationDescription")
    private String applicationDescription;

    @JsonProperty("Serviceable")
    private String serviceable ;

    @JsonProperty("Testable")
    private String testable;

    @OneToMany(mappedBy = "fileDetails")
    @JsonProperty("CompatibleAssemblies")
    private List<CompatibleAssembly> compatibleAssemblies;


    @OneToMany(mappedBy = "fileDetails")
    @JsonProperty("FunctionalTypeValues")
    private List<FunctionalTypeValues> functionalTypeValues;

    @JsonProperty("Sellable")
    private String sellable;

    @JsonProperty("ResidentOnVehicle")
    private String residentOnVehicle;

    @JsonProperty("DigitallySigned")
    private String digitallySigned;

    @JsonProperty("ConsumerViewable")
    private String consumerViewable;

    @JsonProperty("ConsumerDownloadable")
    private String consumerDownloadable;

    @JsonProperty("DealerDownloadable")
    private String dealerDownloadable;

    @JsonProperty("OTAViewable")
    private String oTAViewable;

    @JsonProperty("OTADownloadable")
    private String oTADownloadable;
}
