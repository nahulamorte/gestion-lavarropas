package com.residencia.gestion_lavadero.repository;

import com.residencia.gestion_lavadero.model.Lavado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LavadoRepository extends JpaRepository<Lavado, Long> {
    public Lavado save(Lavado nuevoLavado);
}
