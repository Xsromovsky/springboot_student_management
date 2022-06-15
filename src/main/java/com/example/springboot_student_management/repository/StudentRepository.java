package com.example.springboot_student_management.repository;

import com.example.springboot_student_management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Long> {



}
