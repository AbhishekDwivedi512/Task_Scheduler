package com.task.managemnt.system.controller;

import com.task.managemnt.system.DTO.CheckDto;
import com.task.managemnt.system.DTO.TaskDto;
import com.task.managemnt.system.entity.Status;
import com.task.managemnt.system.entity.Taskentity;
import com.task.managemnt.system.service.Servicecreation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private  final Servicecreation servicecreation;

    @PostMapping("/task/register")

    public ResponseEntity<CheckDto> Register(@RequestBody TaskDto taskDto){

        return ResponseEntity.status(HttpStatus.CREATED).body(servicecreation.Register(taskDto));
    }

    @PutMapping("/task/update/{id}")
    public Taskentity update(@PathVariable("id") Long t_Id,
                             @RequestBody TaskDto taskDto){

        return servicecreation.Update(t_Id, taskDto);
    }

    @DeleteMapping("/task/delete/{id}")

    public Taskentity deleteById(@PathVariable("id") Long t_Id){

       return servicecreation.delete(t_Id);
    }





}
