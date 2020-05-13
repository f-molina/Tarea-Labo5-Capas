package com.uca.capas.jpa.controller;

import java.util.List;
import javax.validation.Valid;
import com.uca.capas.jpa.domain.Estudiante;
import com.uca.capas.jpa.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    private EstudianteService estudianteService;

    @RequestMapping("/inicio")
    public ModelAndView nuevoEstudiante() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("estudiante", new Estudiante());
        mav.setViewName("index");

        return mav;
    }

    //mostrar lista de estudiantes guardados
    @RequestMapping("/listado")
    public ModelAndView listadoEstudiantes() {
        ModelAndView mav = new ModelAndView();
        List<Estudiante> estudiantes = null;
        try {
            estudiantes = estudianteService.findAll();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        mav.addObject("estudiantes", estudiantes);
        mav.setViewName("listado");

        return mav;
    }

    //insertar / guardar
    @RequestMapping("/insertarEstudiante")
    public ModelAndView guardarEstudiante(@Valid @ModelAttribute Estudiante estudiante, BindingResult result) {
        ModelAndView mav = new ModelAndView();
        if(result.hasErrors()) {
            mav.setViewName("index");
        }
        else {
            estudianteService.save(estudiante);
            mav.addObject("listado");
            mav.setViewName("index");
        }
        return mav;
    }
}