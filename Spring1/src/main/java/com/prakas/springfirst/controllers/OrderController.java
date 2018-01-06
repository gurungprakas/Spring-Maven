/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.springfirst.controllers;

import com.prakas.springfirst.dao.CustomerDAO;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    private CustomerDAO customerDAO;
    //private OrderDAO orderDAO;
    //@Autowired
    @RequestMapping(method = RequestMethod.GET)
    public String index( Model model) throws ClassNotFoundException, SQLException{
        model.addAttribute("customers", customerDAO.getAll());
        return "order/index";
    }
    
}
