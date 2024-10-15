package com.taskmanager.task_manager.Service;

import com.taskmanager.task_manager.Model.Task;
import com.taskmanager.task_manager.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll(); // Deve retornar a lista de tarefas
    }

    public Task createTask(Task task) {
        return taskRepository.save(task); // Deve retornar a tarefa criada
    }

    public Task updateTask(Long id, Task taskDetails) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setTitle(taskDetails.getTitle());
        task.setDescription(taskDetails.getDescription());
        task.setCompleted(taskDetails.isCompleted()); // Certifique-se de que está atualizando todos os campos
        return taskRepository.save(task); // Deve retornar a tarefa atualizada
    }

    public void deleteTask(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        taskRepository.delete(task); // Confirma a exclusão
    }
}
