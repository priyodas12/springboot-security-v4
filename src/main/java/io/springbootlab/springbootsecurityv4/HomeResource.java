package io.springbootlab.springbootsecurityv4;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @RequestMapping(value ="/home",method= RequestMethod.GET)
    public String home(){
        return "<h1><center>Home Page</center></h1>";
    }
}
