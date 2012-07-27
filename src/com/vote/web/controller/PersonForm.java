package com.vote.web.controller;
/**
 * @author zhougui.botany
 * @version  Creat time：2011-9-28 上午11:01:23
 * 
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.vote.web.model.Person;
import com.vote.web.service.DummyService;
@Controller
@RequestMapping("/personForm.htm") 
@SessionAttributes("person") 
public class PersonForm { 
  
    private final DummyService dummyService; 
  
    @Autowired
    public PersonForm(DummyService dummyService) { 
        this.dummyService = dummyService; 
    } 
  
    @RequestMapping(method = RequestMethod.GET) 
    public String setupForm(@RequestParam("personId") int id, ModelMap model) { 
        Person person = this.dummyService.retrievePerson(id); 
        model.addAttribute("person", person); 
        return "personForm"; 
    } 
  
    @RequestMapping(method = RequestMethod.POST) 
    public String processSubmit(@ModelAttribute("person") Person person, BindingResult result, SessionStatus status) { 
           this.dummyService.savePerson(person); 
            status.setComplete(); 
            return "redirect:personDisplay.htm"; 
    } 
}