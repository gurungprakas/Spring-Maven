/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.springfirst.controllers;

import com.prakas.springfirst.dao.CustomerDAO;
import com.prakas.springfirst.dto.CustomerDTO;
import com.prakas.springfirst.entity.Customer;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class DefaultController {
    @Autowired
    private CustomerDAO customerDAO;
  
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        try{
        model.addAttribute("customers", customerDAO.getAll());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return "index";
    }
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return "customer/add";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String save(@ModelAttribute("CustomerDTO") CustomerDTO cDTO){
        try{
        Customer c=new Customer(0, cDTO.getFirstName(), cDTO.getLastName(), cDTO.getEmail(), cDTO.getContactNo(), cDTO.isStatus());
        customerDAO.insert(c);
        }catch(Exception ex){
            
        }
        return "redirect:/";
    }
    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public String edit(Model model,@PathVariable("id")int id){
        try{
        model.addAttribute("customer", customerDAO.getById(id));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return "customer/edit";
    }
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public String update(@ModelAttribute("Customer") Customer c){
        try{
        
        customerDAO.update(c);
        //c=Customer(0, cDTO.getFirstName(), cDTO.getLastName(), cDTO.getEmail(), cDTO.getContactNo(), cDTO.isStatus());
        }catch(Exception ex){
            
        }
        return "redirect:/";
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable(value ="id") int id) {
        try {
            customerDAO.delete(id);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return "redirect:/";
    }
    

    
}
