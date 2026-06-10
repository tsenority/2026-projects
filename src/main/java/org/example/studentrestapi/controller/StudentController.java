package org.example.studentrestapi.controller;

import org.example.studentrestapi.model.Student;
import org.springframework.web.bind.annotation.*; //imports all the api annotations with *


import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/students")

    public class StudentController {
    List<Student> students = new ArrayList<>();

    public StudentController() {

        students.add(new Student(1, "john", "Java"));
        students.add(new Student(2, "Sarah", "Python"));
        students.add(new Student(3, "Mike", "Spring Boot"));

    }

    //GET ALL STUDENTS
    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }

    //GET STUDENT BY ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {

        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    //ADD NEW STUDENT
    @PostMapping
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        return "Student added successfully";
    }

    //UPDATE STUDENT
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(updatedStudent.getName());
                student.setCourse(updatedStudent.getCourse());
                return "Student updated successfully";
            }
        }
        return "Student not found";
    }

    //DELETE STUDENT
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                return "Student deleted successfully";

            }
        }

        return "Student not found";
    }

}
