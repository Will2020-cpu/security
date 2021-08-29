package com.security.aprendosec.controller;


import com.security.aprendosec.models.Students;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private static final List<Students> STUDENTS = Arrays.asList(
            new Students(1L,"Willian",20,"1007230434"),
            new Students(2L,"Jose",20,"1007230434")
    );

    @GetMapping
    public List<Students> getAllStudents(){
        return  STUDENTS;
    }

    @PostMapping
    public void insertNewStudent(@RequestBody Students students){
        System.out.println(students);
    }

    @DeleteMapping(path = "{id}")
    public void deleteStudent(@PathVariable("id") Integer id){
        System.out.println(id);
    }

    @PutMapping(path = "{id}")
    public void updateStudent(@PathVariable("id") Integer id, @RequestBody Students students){
        System.out.printf("%s%n","%s",students,id);
    }
}
