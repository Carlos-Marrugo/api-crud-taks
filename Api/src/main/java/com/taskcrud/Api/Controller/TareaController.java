package com.taskcrud.Api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskcrud.Api.Model.Tarea;
import com.taskcrud.Api.Repository.TareaRepository;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {
    
    @Autowired
    private TareaRepository tareaRepository;

    @GetMapping
    public Tarea crearTarea(@RequestBody Tarea tarea) { return tareaRepository.save(tarea);
    
    @GetMapping("/{id}")
    public ResponseEntity<Tarea> obtenerTarea(@PathVariable Long id) {
        return tareaRepository.findById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }
        
    
}
