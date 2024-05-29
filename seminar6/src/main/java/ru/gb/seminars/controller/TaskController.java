package ru.gb.seminars.controller;

import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @PostMapping
    public ResponseEntity<Task> addTask(@RequestBody Task task){
        taskService.createTask(task);
        return new ResponseEntity<>(task, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Task>> viewTasks(){

        return new ResponseEntity<>(taskService.getTasks(),HttpStatus.OK);
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<Task>> viewByStatus(@PathVariable TaskStatus taskStatus){
        return new ResponseEntity<>(taskService.viewByStatus(taskStatus),HttpStatus.OK);
    }

    @PutMapping("/{id},{status}")
    public ResponseEntity<Optional<Task>> updateTaskStatus(@PathVariable Long id, @PathVariable TaskStatus taskStatus){
        taskService.updateStatus(id,taskStatus);
        return new ResponseEntity<>(taskService.getTaskbyId(id),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){
        return ResponseEntity.ok().build();
    }


}
