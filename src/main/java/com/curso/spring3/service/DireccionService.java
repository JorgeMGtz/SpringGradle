package com.curso.spring3.service;

import com.curso.spring3.dto.request.DireccionRequest;
import com.curso.spring3.dto.request.EmpleosRequest;
import com.curso.spring3.model.Direcciones;
import com.curso.spring3.model.Empleos;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DireccionService {

    List<Direcciones> findAlladdress();

    ResponseEntity<Direcciones> guardarDirecciones(Direcciones direcciones);

    ResponseEntity<Direcciones> guardarDirecciones2(DireccionRequest direccion);

    Direcciones buscarDireccionPorId (Long id);

    ResponseEntity<Object> updateDirecciones (DireccionRequest direccion);

    void eliminarDirecciones(Long id);
}
