package com.example.springboot_student_management;

import com.example.springboot_student_management.entity.Student;
import com.example.springboot_student_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootStudentManagementApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudentManagementApplication.class, args);
    }
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student("John", "Doe", "johndoe@gmail.com");
        studentRepository.save(student1);
        Student student2 = new Student("Jane", "Doe", "jane@azet.sk");
        studentRepository.save(student2);
        Student student3 = new Student("John", "Smith", "smithovice@gmail.com");
        studentRepository.save(student3);

    }
}
