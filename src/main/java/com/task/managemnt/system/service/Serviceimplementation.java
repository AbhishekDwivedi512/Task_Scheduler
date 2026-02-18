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
                .T_Id(taskDto.getT_id())
                .title(taskDto.getTitle())
                .Description(taskDto.getDescription())
                .duedate(taskDto.getDuedate())
                .priority(taskDto.getPriority())
                .status(taskDto.getStatus())
                .build();

        Taskentity taskentitysave = (Taskentity) taskRepository.save(taskentity);

            return CheckDto.builder()
                    .t_id(taskDto.getT_id())
                    .title(taskDto.getTitle())
                    .priority(taskDto.getPriority())
                    .Description(taskDto.getDescription())
                    .duedate(taskDto.getDuedate())
                    .status(taskDto.getStatus())
                    .build();

    }

    @Override
    public Taskentity Update(TaskDto taskDto) {

        Taskentity present =
                taskRepository.findByTitle(taskDto.getTitle())
                        .orElseThrow(() ->
                                new TaskException("The task by this title is not found"));

        present.setPriority(taskDto.getPriority());
        present.setStatus(taskDto.getStatus());

        return taskRepository.save(present);
    }


}
