package com.uca.capas.jpa.dao;

import java.util.List;
import com.uca.capas.jpa.domain.Estudiante;
import org.springframework.dao.DataAccessException;

public interface EstudianteDAO {
    
    public List<Estudiante> findAll() throws DataAccessException;

    public void save(Estudiante e) throws DataAccessException;
}