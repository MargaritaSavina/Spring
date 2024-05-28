package ru.gb.seminars.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.seminars.exeption.TaskNotFindExeption;
import ru.gb.seminars.model.Task;
import ru.gb.seminars.model.TaskStatus;
import ru.gb.seminars.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskService {
    private TaskRepository taskRepository;

    public List<Task> getTasks(){ return taskRepository.findAll();}

    public Optional<Task> getTaskbyId(Long id)throws TaskNotFindExeption {
        return taskRepository.findById(id);}

    public void createTask(Task task){taskRepository.save(task);}

    public List<Task> viewByStatus(TaskStatus taskStatus){
    return taskRepository.findAllByTaskStatus(taskStatus);
    }

    public void updateStatus(Long id,TaskStatus taskStatus) throws TaskNotFindExeption {
        taskRepository.findById(id).get().setTaskStatus(taskStatus);
    }

    public void deleteTask(Long id) throws TaskNotFindExeption {
        taskRepository.deleteById(id);
    }



}
