package com.backend.challenge.Interaction.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Protocol {

    @Id
    @GeneratedValue
    @JsonIgnore
    int protocolId;

    @JsonProperty("NetworkWireless")
    private String networkWireless ;

    @JsonProperty("NetworkProtocol")
    private String networkProtocol ;

    @ManyToOne
    @JoinColumn(name = "value_type")
    @JsonIgnore
    private FileDetails fileDetails;
}
