package com.backend.challenge.Interaction.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity(name = "fileValues")
@NoArgsConstructor
@Data
public class Values {

    @Id
    private String fileValue;


    @ManyToOne
    @JoinColumn(name = "value_type")
    @JsonIgnore
    private FileDetails fileDetails;




}
