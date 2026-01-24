package com.javagenerics.universitycoursemanagementsystem;
import java.util.ArrayList;
import java.util.List;
public class UniversityCourseDemo 
{
		public static void displayCourses(List<? extends CourseType> course) 
		{
			for(CourseType type: course) 
			{
				System.out.println(type.getEvaluationType());
			}
		}

	    public static void main(String[] args) 
	    {

	        Course<ExamCourse> math =new Course<>("Mathematics", "Science", new ExamCourse());

	        Course<AssignmentCourse> cs =new Course<>("Data Structures", "Computer Science", new AssignmentCourse());

	        Course<ResearchCourse> phd =new Course<>("AI Research", "Engineering", new ResearchCourse());

	        System.out.println(math);
	        System.out.println(cs);
	        System.out.println(phd);

	        List<CourseType> courseTypes = new ArrayList<>();
	        courseTypes.add(new ExamCourse());
	        courseTypes.add(new AssignmentCourse());
	        courseTypes.add(new ResearchCourse());

	        System.out.println("\n=== Evaluation Types ===");
	        displayCourses(courseTypes);
	    }
}
