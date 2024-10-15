package com.taskmanager.task_manager.Repository;

import com.taskmanager.task_manager.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
