/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.webapp.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/admin/customer")
public class CustomerController {
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "<h1>Secured Area!!</h1>";
    }
    
}
