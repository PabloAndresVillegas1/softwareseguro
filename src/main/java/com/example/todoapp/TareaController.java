package com.example.todoapp;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    private List<Tarea> tareas = new ArrayList<>();

    public TareaController() {
        // Añadir algunas tareas de ejemplo
        tareas.add(new Tarea(1L, "Tarea 1", false));
        tareas.add(new Tarea(2L, "Tarea 2", true));
    }
    @GetMapping
    public List<Tarea> obtenerTodasLasTareas() {
        return tareas;
    }
    @PostMapping
    public Tarea crearTarea(@RequestBody Tarea nuevaTarea) {
        tareas.add(nuevaTarea);
        return nuevaTarea;
    }
}