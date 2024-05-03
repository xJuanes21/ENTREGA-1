package edu.uao.project.backend.Model;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.DBRef;

//import java.util.List;

//import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Document(collection = "Tutors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TutorsModel {
    @Id
    private String _id;
    private String nombre;
    private String carrera;
    private Integer semestre;
    private Double calificacion_prom;
    @DBRef
    private ArrayList<CourseModel> courses;

    
}

