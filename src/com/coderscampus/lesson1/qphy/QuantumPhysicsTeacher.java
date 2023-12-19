package com.coderscampus.lesson1.qphy;

import com.coderscampus.lesson1.phys.PhysicsTeacher;

public class QuantumPhysicsTeacher extends PhysicsTeacher {
	
	public QuantumPhysicsTeacher () {
		System.out.println("Inside the QuantumPhysicsTeacher constructor");
		this.setClasses("Quant 101, Quant 102");
		this.setLevelOfEducation("PhD");
	}
	
	public void teach () {
		System.out.println("I'm a quantum physics teacher and I's now in a super-position of teaching!");
	}
	
}
