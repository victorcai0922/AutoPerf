/**
 * 
 */
package com.vote.web.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vote.web.service.DummyService;
  
/** *//** 
 * PersonDisplay class, display controller for the 'personDisplay.jsp' 
 * Copyright : adobocode.com , 2010 
 * @author Paul Sydney Orozco | xtrycatchx@gmail.com 
 * 
 */
@Controller
public class PersonDisplay { 
  
     private final DummyService dummyService; 
  
    @Autowired
    public PersonDisplay(DummyService dummyService) { 
        this.dummyService = dummyService; 
    } 
  
    @RequestMapping("/index.htm") 
    public String index(ModelMap model,HttpServletRequest request){ 
        return "/default.htm"; 
    } 
    
    @RequestMapping("/personDisplay.htm") 
    public ModelMap defaultHandler(){ 
        return new ModelMap("personList", this.dummyService.getDummyList()); 
    } 
 }
