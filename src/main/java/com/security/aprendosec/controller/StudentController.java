package com.security.aprendosec.controller;


import com.security.aprendosec.models.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @GetMapping
    public Students getAllStudents(){
        Students n = new Students();
        n.setNombre("Willian");
        n.setEdad(21);
        n.setDocumento("1007230434");

        return n;
    }
}
