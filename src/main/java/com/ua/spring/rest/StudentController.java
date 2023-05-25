package com.ua.spring.rest;

import com.ua.spring.domain.Student;
import com.ua.spring.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @GetMapping("/students")
    public List<Student> findAll() {
        return studentService.findAll();
    }

}
