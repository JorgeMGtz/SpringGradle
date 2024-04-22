
package com.curso.spring3.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name= "Empleos")
@Getter
@Setter
public class Empleos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empleo_id")
    private Long empleoId;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "empresa")
    private String empresa;

    @Column(name = "salario")
    private double salario;

}
