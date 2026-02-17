package com.task.managemnt.system.DTO;


import com.task.managemnt.system.entity.Priority;
import com.task.managemnt.system.entity.Status;
import lombok.*;

import java.util.Date;

@Builder
@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {

    private String title;
    private String Description;
    private Date duedate;
    private Status status;
    private Priority priority;

}
