package com.uca.capas.jpa.service;

import java.util.List;

import javax.transaction.Transactional;
import com.uca.capas.jpa.dao.EstudianteDAO;
import com.uca.capas.jpa.domain.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    EstudianteDAO estudianteDao;

    @Override
    public List<Estudiante> findAll() throws DataAccessException {
        return estudianteDao.findAll();
    }

    @Override
    @Transactional
    public void save(Estudiante e) throws DataAccessException {
        estudianteDao.save(e);
    }
}