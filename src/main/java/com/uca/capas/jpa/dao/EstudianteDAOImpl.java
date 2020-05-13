package com.uca.capas.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.uca.capas.jpa.domain.Estudiante;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class EstudianteDAOImpl implements EstudianteDAO {

    @PersistenceContext(unitName = "capas")
    private EntityManager entityManager;

    @Override
    public List<Estudiante> findAll() throws DataAccessException {
        StringBuffer sb = new StringBuffer();
        sb.append("select * from public.ESTUDIANTE");
        Query query = entityManager.createNativeQuery(sb.toString(), Estudiante.class);
        List<Estudiante> res = query.getResultList();

        return res;
    }

    @Override
    public void save(Estudiante e) throws DataAccessException {
        entityManager.persist(e);
    }
}