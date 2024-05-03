package edu.uao.project.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import edu.uao.project.backend.Model.CourseModel;
import edu.uao.project.backend.Repository.ICourseRepository;

@Service
public class CourseServiceImp implements ICourseService {
    @Autowired
    ICourseRepository courseRepository;
    @Override
    public String crearCurso(@RequestBody CourseModel course) {
        this.courseRepository.save(course);
        return "El Curso "+course.getName()+" fue creado exitosamente";
    }

    @Override
    public List<CourseModel> listarCursos() {
        return this.courseRepository.findAll();
    }
}
