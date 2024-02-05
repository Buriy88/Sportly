package com.example.Sportly.Models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "exercises")
@AllArgsConstructor
@NoArgsConstructor
public class Exercises {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "id")
    private Long id;
    @Column(name = "exerciseName")
    private String exerciseName;
    @Column(name = "reps")
    private int reps;
    @Column(name = "weight")
    private double weight;
    @Column(name = "impression",columnDefinition = "text")
    private String impression;

}
