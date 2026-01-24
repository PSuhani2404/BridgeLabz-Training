package com.javagenerics.universitycoursemanagementsystem;

public class ExamCourse extends CourseType
{
	public ExamCourse() {
        super("Written Exam");
    }

    @Override
    public String getEvaluationType() {
        return "Exam-Based";
	}

}
