package com.example.cv.Repositories;
import com.example.cv.models.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    // Aqui você pode adicionar métodos personalizados de consulta, se necessário
}
