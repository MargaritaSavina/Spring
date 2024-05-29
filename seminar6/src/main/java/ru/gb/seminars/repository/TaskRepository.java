package ru.gb.seminars.repository;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.seminars.model.Task;
import ru.gb.seminars.model.TaskStatus;

import java.util.List;

@Repository

public interface TaskRepository extends JpaRepository <Task,Long> {
    public List<Task> findAllByTaskStatus(TaskStatus taskStatus);

}
