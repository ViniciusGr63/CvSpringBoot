package com.example.cv.Repositories;

import com.example.cv.models.Curriculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    // Aqui você pode adicionar métodos personalizados de consulta, se necessário
}
