package com.javagenerics.resumescreeningsystem;
import java.util.*;
public class ProductManager extends JobRole
{
	public String getRoleName()
	{
		return "Product-Manager";
	}
	public List<String> getRequiredSkills()
	{
		return List.of("Agile","Product Roadmap","UX Design Basics","Stakeholder Mgmt", "Market Research", "Strategic Thinking");  
			    
	}

}
