package edu.uao.project.backend.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.uao.project.backend.Model.UsersModel;

public interface IUsersRepository extends MongoRepository<UsersModel, String>{
  
}
