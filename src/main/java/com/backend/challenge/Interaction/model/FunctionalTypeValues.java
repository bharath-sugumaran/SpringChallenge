package com.backend.challenge.Interaction.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Embeddable
public class FunctionalTypeValues {

    @Id
    public String functionalType;

    @ManyToOne
    @JoinColumn(name = "value_type")
    @JsonIgnore
    private FileDetails fileDetails;

}
