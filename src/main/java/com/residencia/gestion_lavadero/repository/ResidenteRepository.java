package com.residencia.gestion_lavadero.repository;

import com.residencia.gestion_lavadero.model.Residente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ResidenteRepository extends JpaRepository<Residente, Long> {
    Optional<Residente> findByDni(String dni);

    boolean existsByDni(String dni);
}
