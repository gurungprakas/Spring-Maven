/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.webapp.configuration;

import javax.activation.DataSource;
import org.springframework.beans.factory.config.PreferencesPlaceholderConfigurer;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class SystemConfig {
    @Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver vr=new InternalResourceViewResolver("WEB-INF/views/", ".jsp");
        return vr;
    }
   /* @Bean
    public PropertyPlaceholderConfigurer getPropertyConfigurer(){
        PropertyPlaceholderConfigurer pc=new PreferencesPlaceholderConfigurer();
        pc.setLocation(new FileSystemResource("WEB-INF/db/jdbc.properties"));
        return pc;
        
    }*/
    @Bean
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jbdc:mysql://localhost/crm");
        ds.setUsername("root");
        ds.setPassword("");
        return ds;
        
    }
    @Bean
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate((javax.sql.DataSource) getDataSource());
        return jdbcTemplate;
    }
    
    
}
