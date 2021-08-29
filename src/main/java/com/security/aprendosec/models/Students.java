package com.security.aprendosec.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
public class Students {

    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private int edad;

    @Getter @Setter
    private String documento;

    public Students(){}

    public Students(Long id, String nombre, int edad, String documento) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }
}
