package com.curso.spring3.repository;

import com.curso.spring3.model.Direcciones;
import com.curso.spring3.model.Empleos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface DireccionesRepository extends JpaRepository<Direcciones, Long> {
}
