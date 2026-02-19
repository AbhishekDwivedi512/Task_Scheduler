package com.task.managemnt.system.service;

import com.task.managemnt.system.DTO.CheckDto;
import com.task.managemnt.system.DTO.TaskDto;
import com.task.managemnt.system.entity.Taskentity;
import com.task.managemnt.system.exception.TaskException;
import com.task.managemnt.system.repository.TaskRepository;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Builder
@Data
@Setter
@Getter
@AllArgsConstructor
public class Serviceimplementation implements Servicecreation {

   private final TaskRepository taskRepository;


    @Override
    public CheckDto Register(TaskDto taskDto) {
        Optional<Taskentity> existingTask = taskRepository.findByTitle(taskDto.getTitle());

        if(existingTask.isPresent()){
            throw new TaskException("Task is already exist");
        }

        Taskentity taskentity = Taskentity.builder()
                .t_Id(taskDto.getT_Id())
                .title(taskDto.getTitle())
                .Description(taskDto.getDescription())
                .duedate(taskDto.getDuedate())
                .priority(taskDto.getPriority())
                .status(taskDto.getStatus())
                .build();

        Taskentity taskentitysave = (Taskentity) taskRepository.save(taskentity);

            return CheckDto.builder()
                    .t_Id(taskDto.getT_Id())
                    .title(taskDto.getTitle())
                    .priority(taskDto.getPriority())
                    .Description(taskDto.getDescription())
                    .duedate(taskDto.getDuedate())
                    .status(taskDto.getStatus())
                    .build();

    }

    public Taskentity Update(Long id, TaskDto taskDto) {

        Taskentity task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        task.setTitle(taskDto.getTitle());
        task.setDescription(taskDto.getDescription());
        task.setStatus(taskDto.getStatus());

        return taskRepository.save(task);
    }
}



