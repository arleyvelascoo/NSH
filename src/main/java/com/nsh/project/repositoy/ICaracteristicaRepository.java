package com.nsh.project.repositoy;

import com.nsh.project.model.Caracteristica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICaracteristicaRepository extends JpaRepository<Caracteristica, Long> {
}
