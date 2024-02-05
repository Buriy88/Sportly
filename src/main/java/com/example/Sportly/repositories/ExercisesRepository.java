package com.example.Sportly.repositories;

import com.example.Sportly.Models.Exercises;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExercisesRepository extends JpaRepository<Exercises,Long> {

}
