package edu.uao.project.backend.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Document(collection = "Courses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseModel {
    @Id
    private String _id;
    private String name;
    private String category;
    private Double price;
    private Double totalHours;
}
