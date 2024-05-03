package edu.uao.project.backend.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.uao.project.backend.Model.CourseModel;

public interface ICourseRepository extends MongoRepository<CourseModel, String>{

}
