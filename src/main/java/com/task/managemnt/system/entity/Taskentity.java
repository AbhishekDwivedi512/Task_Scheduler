package com.task.managemnt.system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumeratedValue;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Taskentity {
    private String title;
    private String Description;
    private Date duedate;
    private Status status;
    private Priority priority;
}
