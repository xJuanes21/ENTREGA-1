package edu.uao.project.backend.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.uao.project.backend.Model.TutorsModel;

public interface ITutorsRepository extends MongoRepository<TutorsModel, String> {


    
} 
    

