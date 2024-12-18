package com.example.todoapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TareaVistaController {

    private final TareaController tareaController;

    public TareaVistaController(TareaController tareaController) {
        this.tareaController = tareaController;
    }

    @GetMapping("/tareas")
    public String verTareas(Model model) {
        List<Tarea> tareas = tareaController.obtenerTodasLasTareas();
        model.addAttribute("tareas", tareas);
        return "tareas";
    }
}
