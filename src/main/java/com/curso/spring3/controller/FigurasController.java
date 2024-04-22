package com.curso.spring3.controller;

import com.curso.spring3.dto.CirculoDto;
import com.curso.spring3.dto.RectanguloDto;
import com.curso.spring3.service.CirculoService;
import com.curso.spring3.service.RectanguloService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.geom.Area;

@RestController
@RequestMapping("figuras")
@Slf4j
//sirve para algunos errores que pueden exsistir en postman
@CrossOrigin
@Tag(name = "Figuras")
public class FigurasController {

    //Autowired lo usamos para poder inyectar dependecias
    @Autowired
    private RectanguloService rectanguloService;

    //Opcion 1
    //@GetMapping("/area-rectangulo/{base}/{altura}")

    //Opcion 2 es mas larga y menos estetica
    @RequestMapping(method = RequestMethod.GET, value = "/area-rectangulo/{base}/{altura}")
    @Operation(summary =  "Operation para calcular el area de un rectangulo")
    public double calcularRectangulo(@PathVariable @Schema(description = "base de rectangulo", example = "20.46") double base,
                                     @PathVariable @Schema(description = "Altura del rectangulo", example = "10.57") double altura){
        return base * altura;
    }

    @PostMapping("/rectangulo")
    //se pone request ya que es la peticion que se quiere ejecutar
    public double calculateAreaRectangulo(@RequestBody RectanguloDto request){

        double area = request.getBase() * request.getAltura();

        return area;
    }



    @PostMapping("/area-rectangulo2")
    public double calcularAreaRectangulo(@RequestBody RectanguloDto request){
        return  rectanguloService.calcularAreaRectangulo(request);
    }

    @Autowired
    private CirculoService circuloService;

    @GetMapping("/area-circulo/{radio}/")
        public double calcularAreaCirculo(@PathVariable CirculoDto requestCirculo){
        return circuloService.calcularAreaCirculo(requestCirculo);

}




}
