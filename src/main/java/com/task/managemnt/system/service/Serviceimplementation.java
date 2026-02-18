package com.task.managemnt.system.service;

import com.task.managemnt.system.DTO.TaskDto;
import com.task.managemnt.system.entity.Taskentity;
import com.task.managemnt.system.repository.TaskRepository;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Builder
@Data
public class serviceimplementation implements servicecreation{

   private final TaskRepository taskRepository;


    @Override
    public TaskDto Register(TaskDto taskDto) {
        Optional<Taskentity> existingTask = taskRepository.findByTitle(taskDto.getTitle());

        if(existingTask.isPresent()){
            throw
        }
    }
}
