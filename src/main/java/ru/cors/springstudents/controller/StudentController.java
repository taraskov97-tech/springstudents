package ru.cors.springstudents.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.cors.springstudents.model.Student;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> findAllStudent(){
        return List.of(
                Student.builder().firstName("Oleh").email("oleh12@gmail.com").age(41).build(),
                Student.builder().firstName("Vasya").email("vasya12@gmail.com").age(41).build(),
                Student.builder().firstName("Anna").email("anna12@gmail.com").age(41).build()
                );
    }
}
