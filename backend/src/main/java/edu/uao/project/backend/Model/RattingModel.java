package edu.uao.project.backend.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Document(collection = "Ratings")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class RattingModel {
    @Id
    private String _id;
    private String  idCurso;
    private Float rating;
    
}
