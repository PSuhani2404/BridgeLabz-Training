package com.javagenerics.universitycoursemanagementsystem;

public class Course<T extends CourseType>
{
	private String courseName;
	private String department;
	private T courseType;
	
	Course(String courseName,String department,T courseType)
	{
		this.courseName = courseName;
		this.department = department;
		this.courseType = courseType;
	}
	
	public T geCourseType()
	{
		return courseType;
	}
	
	@Override
	public String toString()
	{
		return "Course: "+courseName+ ", Department: "+department+ ","+courseType;
	}

}
