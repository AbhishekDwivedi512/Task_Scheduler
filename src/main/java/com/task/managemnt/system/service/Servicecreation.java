package com.task.managemnt.system.service;

import com.task.managemnt.system.DTO.CheckDto;
import com.task.managemnt.system.DTO.TaskDto;
import com.task.managemnt.system.entity.Taskentity;

public interface Servicecreation {

    CheckDto Register(TaskDto taskDto);

    Taskentity Update(Long t_Id,TaskDto taskDto);


}
