package com.backend.challenge.Interaction.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Embeddable
public class CompatibleAssembly {

    @Id
    private String AssyPN ;

    @ManyToOne
    @JoinColumn(name = "value_type")
    @JsonIgnore
    private FileDetails fileDetails;



}
