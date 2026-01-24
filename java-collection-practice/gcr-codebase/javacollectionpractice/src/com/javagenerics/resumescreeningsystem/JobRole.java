package com.javagenerics.resumescreeningsystem;
import java.util.*;
public abstract class JobRole {
	public abstract String getRoleName();
	public abstract List<String> getRequiredSkills();
	@Override
	public String toString()
	{
		return getRoleName() + " (Required: " + getRequiredSkills() + ")";
	}
}
