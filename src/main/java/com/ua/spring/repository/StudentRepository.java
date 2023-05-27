package com.ua.spring.repository;

import com.ua.spring.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findStudentByName(String name);

    Optional<Student> findStudentByNameAndAge(String name, int age);
}