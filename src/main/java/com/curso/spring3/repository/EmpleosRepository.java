package com.curso.spring3.repository;

import com.curso.spring3.model.Empleos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleosRepository extends JpaRepository<Empleos, Long> {



}
