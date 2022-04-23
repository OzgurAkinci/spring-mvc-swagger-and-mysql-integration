package com.app.controller;

import com.app.model.Parameter;
import com.app.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    ParameterService parameterService;

    @GetMapping("/")
    public ModelAndView showHomePage() {
        List<Parameter> parameters = parameterService.findAll();

        ModelAndView mv = new ModelAndView("home");
        mv.addObject("msg", "Welcome to Home Page");
        mv.addObject("parameters", parameters);

        return mv;
    }
}
