package com.javagenerics.universitycoursemanagementsystem;

public class AssignmentCourse extends CourseType
{
	public AssignmentCourse()
	{
		super("Assignments");
	}
	
	public String getEvaluationType()
	{
		return "Evaluation Based";
	}

}
