package com.task.managemnt.system.DTO;


import com.task.managemnt.system.entity.Priority;
import com.task.managemnt.system.entity.Status;
import lombok.*;

import java.util.Date;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CheckDto {
    private Long t_id;
    private String title;
    private Priority priority;
    private String Description;
    private Date duedate;
    private Status status;
}
