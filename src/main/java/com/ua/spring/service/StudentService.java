package com.ua.spring.service;

import com.ua.spring.domain.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    public static List<Student> findAll() {
        return List.of(
                new Student("Jok", 15, "London"),
                new Student("Jody", 17, "Porto"),
                new Student("Jina", 20, "Sao Paulo"),
                new Student("John", 25, "Washington"));
    }
}
