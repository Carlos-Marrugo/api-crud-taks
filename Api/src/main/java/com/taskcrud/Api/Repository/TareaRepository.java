package com.taskcrud.Api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskcrud.Api.Model.Tarea;

public interface TareaRepository extends JpaRepository <Tarea, Long> {

} 
