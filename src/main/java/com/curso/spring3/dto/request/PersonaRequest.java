package com.curso.spring3.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PersonaRequest {

    private Long idPersona;
    private  String nombre;
    private Integer edad;
    private String genero;
    private Integer idDirecciones;
    private Integer idEmpleos;


}
