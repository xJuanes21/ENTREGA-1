package edu.uao.project.backend.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Document(collection = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersModel {
    @Id
    private String _id;
    private String nombre;
    private String carrera;
    private Double semestre;
    
}
