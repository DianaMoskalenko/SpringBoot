package com.ua.spring.service;

import com.ua.spring.domain.Student;
import com.ua.spring.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private static final StudentRepository studentRepository = null;



    public static Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }
    public static void save(Student student) {
        studentRepository.save(student);
    }



}
