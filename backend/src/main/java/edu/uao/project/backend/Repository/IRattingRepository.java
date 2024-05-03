package edu.uao.project.backend.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.uao.project.backend.Model.RattingModel;

public interface IRattingRepository extends MongoRepository<RattingModel, String> {
    
    
}
