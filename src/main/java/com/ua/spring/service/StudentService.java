package com.ua.spring.service;

import com.ua.spring.domain.Student;
import com.ua.spring.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private static StudentRepository studentRepository;


    public static List<Student> findAll() {
       return (List<Student>) studentRepository.findAll();
    }
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }
    public void save(Student student) {
        studentRepository.save(student);
    }


}
