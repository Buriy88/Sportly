package com.example.Sportly.Services;

import com.example.Sportly.Models.Exercises;
import com.example.Sportly.repositories.ExercisesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Slf4j
@Service
public class ExerciseService {
    private final ExercisesRepository exercisesRepository;

    public List<Exercises> exercisesList()
    {
         return exercisesRepository.findAll();
    }
    public void saveExercises(Exercises exercise)
    {
      log.info("Saving new",exercise);
        exercisesRepository.save(exercise);
    }
    public void deleteExercises(Long id)
    {

        exercisesRepository.deleteById(id);
    }
    public  void deleteAll()
    {
        exercisesRepository.deleteAll();
    }


    public Exercises getExerciesById(Long id) {

        return exercisesRepository.findById(id).orElse(null);
    }
}
