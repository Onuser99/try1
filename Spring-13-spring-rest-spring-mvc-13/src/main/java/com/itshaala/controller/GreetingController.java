package com.itshaala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
public class GreetingController {

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public ModelAndView getGreeting(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("greeting");
        mv.addObject("msg","Good day "+ LocalDateTime.now());
        return mv;
    }

}
