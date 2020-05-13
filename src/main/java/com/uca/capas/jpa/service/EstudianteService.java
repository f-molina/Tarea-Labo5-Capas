package com.uca.capas.jpa.service;

import java.util.List;
import com.uca.capas.jpa.domain.Estudiante;
import org.springframework.dao.DataAccessException;

public interface EstudianteService {
    
    public List<Estudiante> findAll() throws DataAccessException;

    public void save(Estudiante e) throws DataAccessException;
}