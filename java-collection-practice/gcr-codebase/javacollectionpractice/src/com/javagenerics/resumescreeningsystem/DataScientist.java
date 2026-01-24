package com.javagenerics.resumescreeningsystem;
import java.util.*;
public class DataScientist extends JobRole
{
	public String getRoleName()
	{
		return "Data Scientist";
	}
	
	public List<String> getRequiredSkills()
	{
		return List.of("Python","SQL","EXCEL");
	}

}
