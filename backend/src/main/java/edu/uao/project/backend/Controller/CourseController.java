package edu.uao.project.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uao.project.backend.Model.CourseModel;
import edu.uao.project.backend.Service.ICourseService;

@RestController
@RequestMapping ("/curso")
public class CourseController {
    @Autowired
    ICourseService courseService;

    @PostMapping("/")
    public ResponseEntity<String> crearCurso(@RequestBody CourseModel course) {
        courseService.crearCurso(course);
        return new ResponseEntity<String>(courseService.crearCurso(course), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<CourseModel>> listarCursos() {
        List<CourseModel> cursos = courseService.listarCursos();
        return new ResponseEntity<>(cursos, HttpStatus.OK);
    }
    
}
