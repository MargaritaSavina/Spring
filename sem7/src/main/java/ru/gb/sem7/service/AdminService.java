package ru.gb.sem7.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@Service
public class AdminService {
    private String str = "Hello, admin";
}
