package com.suhada.mvcform.controller;

import java.util.*;

import com.suhada.mvcform.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value="/register")
public class RegistrationController
{
    @RequestMapping(method=RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model)
    {
        User userForm = new User();
        model.put("userForm", userForm);
        return "Registration";
    }
    
    

}