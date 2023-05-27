package com.ua.spring.rest;

import com.ua.spring.domain.Student;
import com.ua.spring.repository.StudentRepository;
import com.ua.spring.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;


    @GetMapping("/students/{id}")
    public Optional<Student> findById(@PathVariable Long id) {
        return StudentService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Student student) {
        StudentService.save(student);
    }
}
