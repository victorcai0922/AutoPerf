package com.vote.web.service;
/**
 * @author zhougui.botany
 * @version  Creat time：2011-9-28 上午11:06:17
 * 
 */
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.vote.web.model.Person;
  
/** *//** 
 * Copyright : adobocode.com , 2010 
 * @author Paul Sydney Orozco | xtrycatchx@gmail.com 
 */
@Service
public class DummyService { 
	private Logger logger = LoggerFactory.getLogger(DummyService.class);
    /** *//** 
     * This method supposed to be returning a Collection of Person objects from a DAO layer 
     * For this tutorial, let us just hard-code this List of Person objects 
     */
    public List<Person> getDummyList() { 
        List<Person> list = new ArrayList<Person>(); 
        Person p1 = new Person(); 
        p1.setId(12345); 
        p1.setName("SNDA-zhougui.botany"); 
        p1.setAge(27); 
        p1.setAddress("Dalaguete, Cebu"); 
  
        Person p2 = new Person(); 
        p2.setId(54321); 
        p2.setName("Sydney"); 
        p2.setAge(25); 
        p2.setAddress("Cebu City"); 
  
        list.add(p1); 
        list.add(p2); 
        return list; 
    } 
  
    /** *//** 
     * This method supposed to be returning Person object from a DAO layer 
     * For this tutorial, let us just hard-code the Person instance 
     */
    public Person retrievePerson(int id) { 
        Person person = new Person(); 
        person.setId(56789); 
        person.setName("SNDA-zhougui.botany"); 
        person.setAge(63); 
        person.setAddress("Dalaguete, Cebu"); 
        return person; 
    } 
  
   
    public void savePerson(Person person) { 
        logger.info("Logger Saving" + person); 

    } 
}