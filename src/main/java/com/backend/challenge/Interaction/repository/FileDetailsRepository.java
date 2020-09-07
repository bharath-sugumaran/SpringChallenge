package com.backend.challenge.Interaction.repository;

import com.backend.challenge.Interaction.model.FileDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDetailsRepository extends CrudRepository<FileDetails, String> {

    FileDetails findFileDetailsByTypeAndApplicationPartDetailFileName(String type, String fileName);
}
