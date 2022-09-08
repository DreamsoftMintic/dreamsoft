package com.dreamsoft.ingresosegresos.repositories;

import com.dreamsoft.ingresosegresos.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {



}
