package com.rdas.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by rdas on 30/10/2015.
 */
@Controller
public class HomePageController {
    private static final Logger log = LoggerFactory.getLogger(HomePageController.class);

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() {
        log.debug("\n\n{} \n\n", "Accessing default Root");
        return new ModelAndView("index").addObject("message", "Greetings From Spring Boot!! ");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        log.debug("\n\n{} \n\n", "Accessing default Root");
        return new ModelAndView("index").addObject("message", "Greetings From Spring Boot!! ");
    }
}
