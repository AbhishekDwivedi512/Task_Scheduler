package com.task.managemnt.system.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;

@Entity
@Data
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Taskentity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long t_Id;
    private String title;
    private String Description;
    private Date duedate;
    private Status status;
    private Priority priority;
}
