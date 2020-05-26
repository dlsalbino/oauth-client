package br.com.azusah.oauthclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    ModelAndView getAll(){
        return new ModelAndView("employees");
    }
}
