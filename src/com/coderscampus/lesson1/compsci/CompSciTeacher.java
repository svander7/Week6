package com.coderscampus.lesson1.compsci;

import com.coderscampus.lesson1.Teacher;

public class CompSciTeacher extends Teacher {
	
	public CompSciTeacher () {
		System.out.println("Inside the CompSciTeacher constructor");
		this.setClasses("Comp 101, Comp 102");
		this.setLevelOfEducation("Bachelor of Science Degree.");
	}
}
