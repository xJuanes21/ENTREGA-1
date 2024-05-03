package edu.uao.project.backend.Service;

import java.util.List;

import edu.uao.project.backend.Model.CourseModel;

public interface ICourseService {
    
    String crearCurso(CourseModel course);
    List<CourseModel> listarCursos();
    
}