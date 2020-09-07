package com.backend.challenge.Interaction.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@Embeddable
public class MGMFile {

    @OneToMany(mappedBy = "fileDetails")
    @JsonProperty("Protocol")
    private List<Protocol> protocolList ;

    @JsonProperty("FileFormat")
    private String fileFormat;

    @JsonProperty("Checksum")
    private String checksum;

    @JsonProperty("FileFingerprint")
    private String fileFingerprint;

    @JsonProperty("ROMSizeKB")
    private String rOMSizeKB;

    @JsonProperty("Size")
    private String size;

    @JsonProperty("FileDateModified")
    private String fileDateModified;


}
