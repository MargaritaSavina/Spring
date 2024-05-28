package ru.gb.seminars.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor

@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String title;
    @Column
    private String body;
    @Column
    @DateTimeFormat
    private LocalDateTime dateCreate;
    @Column
    private TaskStatus taskStatus;
}
