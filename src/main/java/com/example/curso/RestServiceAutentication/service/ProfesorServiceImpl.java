package com.example.curso.RestServiceAutentication.service;

import com.example.curso.RestServiceAutentication.dao.IProfesorDao;
import com.example.curso.RestServiceAutentication.entity.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("profesorService")
public class ProfesorServiceImpl implements IProfesorService{

    @Autowired
    private IProfesorDao profesorDao;

    @Override
    public List<Profesor> findAllProfesors() {
        return (List<Profesor>) profesorDao.findAll();
    }

}
