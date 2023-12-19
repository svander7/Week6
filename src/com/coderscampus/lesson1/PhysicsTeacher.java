package com.coderscampus.lesson1;

public class PhysicsTeacher extends Teacher{
	
	public PhysicsTeacher () {
		System.out.println("Inside the PhysicsTeacher constructor");
		this.setClasses("Phys 101, Phys 102");
		this.setLevelOfEducation("Masters of Science Degree.");
	}
	
	public void teach () {
		System.out.println("I'm a physics teacher and I'm now teaching physics");
	}
	
	public void teach (String teacherName) {
		System.out.println("I'm a physics teacher called " + teacherName + " and I'm now teaching physics");
	
}
}