package com.enigmacamp.project.controller;

import com.enigmacamp.project.entity.Student;
import com.enigmacamp.project.repository.StudentRepository;
import com.enigmacamp.project.service.StudentService;
import com.enigmacamp.project.service.impl.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/student")
public class StudentController {
    private final StudentService studentService;
    private final StudentRepository studentRepository;
    private final StudentServiceImpl studentServiceImpl;

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }


    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable String id) {
        studentService.deleteStudentById(id);
    }

    @PostMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @GetMapping("/getall")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @GetMapping("/find/{name}")
    public List<Student> findByName(@PathVariable String name) {
        return studentRepository.findByFullname(name);
    }
}
