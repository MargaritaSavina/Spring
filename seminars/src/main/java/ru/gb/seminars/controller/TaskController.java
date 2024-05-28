package ru.gb.seminars.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.gb.seminars.model.Task;
import ru.gb.seminars.model.TaskStatus;
import ru.gb.seminars.service.TaskService;

import java.util.List;
import java.util.Optional;

@RequestMapping("/tasks")
@RestController
@AllArgsConstructor
public class TaskController {

    private TaskService taskService;
    @PostMapping("/addTask")
    public void addTask(@RequestBody Task task){
        taskService.createTask(task);
    }

    @GetMapping("/getTasks")
    public List<Task> viewTasks(){
        return taskService.getTasks();
    }

    @GetMapping("/status/{status}")
    public List<Task> viewByStatus(@PathVariable TaskStatus taskStatus){
        return taskService.viewByStatus(taskStatus);
    }

    @PutMapping("/{id},{status}")
    public Optional<Task> updateTaskStatus(@PathVariable Long id, @PathVariable TaskStatus taskStatus){
        taskService.updateStatus(id,taskStatus);
        return taskService.getTaskbyId(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
    }


}
