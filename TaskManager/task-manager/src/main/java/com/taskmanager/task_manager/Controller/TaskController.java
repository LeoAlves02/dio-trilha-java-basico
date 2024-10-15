package com.taskmanager.task_manager.Controller;

import com.taskmanager.task_manager.Model.Task;
import com.taskmanager.task_manager.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks(); // Deve retornar a lista de tarefas
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task); // Deve retornar a tarefa criada
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
        return taskService.updateTask(id, taskDetails); // Deve retornar a tarefa atualizada
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id); // Não retorna nada, apenas confirma a exclusão
        return ResponseEntity.noContent().build();
    }
}
