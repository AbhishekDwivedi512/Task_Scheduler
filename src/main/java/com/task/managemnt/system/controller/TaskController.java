package com.task.managemnt.system.controller;

import com.task.managemnt.system.DTO.CheckDto;
import com.task.managemnt.system.DTO.TaskDto;
import com.task.managemnt.system.service.Servicecreation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private  final Servicecreation servicecreation;

    @PostMapping("/task/register")

    public ResponseEntity<CheckDto> Register(@RequestBody TaskDto taskDto){

        return ResponseEntity.status(HttpStatus.CREATED).body(servicecreation.Register(taskDto));
    }



}
