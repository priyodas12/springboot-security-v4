package io.springbootlab.springbootsecurityv4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/home")
public class FormBasedAuthentication {

    @RequestMapping(value ="/form",method= RequestMethod.GET)
    public String home(){
        return "<h1><center>Home Page for form based authentication</center></h1>";
    }
}
