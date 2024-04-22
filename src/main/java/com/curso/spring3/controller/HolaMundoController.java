package com.curso.spring3.controller;

import com.curso.spring3.dto.Persona;
import com.curso.spring3.dto.response.Posts;
import com.curso.spring3.service.EjerciciosService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso-spring")
@Slf4j //notacion para poner logers
@Tag(name = "Hola Mundo Controller")
public class HolaMundoController {

    @Autowired
    private EjerciciosService ejerciciosService;

    @GetMapping("/hola")
    @Operation(summary = "Opercion para mostrar un hola mundo", responses = {})
    public String holaMundo(){

        return "Hola mundo desde spring";

    }

    @GetMapping(path = "/hola/{nombre}")
    @Operation(summary = "Operación para mostrar un hola mundo")
    public String holaMundoCustom(@PathVariable("nombre")String nombre){

        log.info("El nombre que se envia atraves de la url es: " + nombre);
        return "Hola mundo" + nombre;
    }
    @PostMapping("/persona")
    public Persona datosPersona(@Validated @RequestBody Persona persona){

        Integer edad = 0 ;
        //Se puede usar parseInt o valueOf
        edad = Integer.parseInt(persona.getEdad());

        String numero = String.valueOf(persona.getEdad());

        return persona;

    }

    @GetMapping("/nombre")
    public List<String> getNombre(){

         return ejerciciosService.getNombres();
    }

    @GetMapping("/post/{id}")
    @Operation(summary = "Operation para consumir un servicio REST")
    public Posts getPosts(@PathVariable int id){
        return ejerciciosService.getPosts(id);
    }

}
