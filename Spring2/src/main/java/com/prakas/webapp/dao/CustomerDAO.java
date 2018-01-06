/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.webapp.dao;

import com.prakas.webapp.entity.Customer;
import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {
    List<Customer> getAll()throws ClassNotFoundException,SQLException;
    Customer getById(int id)throws ClassNotFoundException,SQLException;
    int insert(Customer c)throws ClassNotFoundException,SQLException;
    int update(Customer c)throws ClassNotFoundException,SQLException;
    int delete(int id)throws ClassNotFoundException,SQLException;
    
}
