package com.vote.web.model;
/**
 * @author zhougui.botany
 * @version  Creat time：2011-9-28 上午11:04:56
 * 
 */
public class Person { 
	 
	   private int id; 
	    private String name; 
	    private int age; 
	    private String address; 
	  
	    public int getId() { 
	        return id; 
	    } 
	    public void setId(int id) { 
	        this.id = id; 
	    } 
	  
	    public String getName() { 
	        return name; 
	    } 
	    public void setName(String name) { 
	        this.name = name; 
	    } 
	    public int getAge() { 
	        return age; 
	    } 
	    public void setAge(int age) { 
	        this.age = age; 
	    } 
	    public String getAddress() { 
	        return address; 
	    } 
	    public void setAddress(String address) { 
	        this.address = address; 
	    } 
	  
	    @Override
	    public String toString(){ 
	        StringBuilder sb = new StringBuilder(); 
	        sb.append("\nname : " + this.name); 
	        sb.append("\nage : " + this.age); 
	        sb.append("\naddress : " + this.address); 
	        return sb.toString(); 
	  
	    } 
	  
	}
