package com.example.Sportly.Controllers;

import com.example.Sportly.Models.Exercises;
import com.example.Sportly.Services.ExerciseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ExerciseController {
    private final ExerciseService exerciseService;


    @GetMapping("/")
    public String exercises( Model model)
    {

        model.addAttribute("exercises",exerciseService.exercisesList());
        return "exercises";
    }
    @GetMapping("/exercises/{id}")
    public String infoExercise(@PathVariable Long id, Model model)
    {
        model.addAttribute("exercises",exerciseService.getExerciesById(id));
        return "exercise-info";
    }
    @PostMapping("/exercises/create")
    public String createExercise(Exercises exercises)
        {
            exerciseService.saveExercises(exercises);
            return "redirect:/";
    }
    @PostMapping("/exercises/delete/{id}")
    public String deleteExercise(@PathVariable Long id)
    {
        exerciseService.deleteExercises(id);
        return "redirect:/";
    }
    @GetMapping("/delete")
    public String deleteAllExercise()
    {
        exerciseService.deleteAll();
        return "redirect:/";
    }
}
