package com.javagenerics.resumescreeningsystem;
import java.util.*;
public class SoftwareEngineer extends JobRole
{
	public String getRoleName()
	{
		return "Software-engineer";
	}

	public List<String> getRequiredSkills()
	{
		return List.of("Java","OOP","Data Structures","Algorithms","Spring Boot");
	}
}
