package com.dreamsoft.ingresosegresos.repositories;

import com.dreamsoft.ingresosegresos.entities.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {
}
