package com.task.managemnt.system.repository;

import com.task.managemnt.system.entity.Taskentity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaskRepository extends JpaRepository {


    Optional<Taskentity> findByTitle(String title);
}
