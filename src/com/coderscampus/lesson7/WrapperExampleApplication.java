package com.coderscampus.lesson7;

public class WrapperExampleApplication {

	public static void main(String[] args) {
		
		/**
		 * byte		-> Byte
		 * short	-> Short
		 * int		-> Integer
		 * long		-> Long
		 * float	-> Float
		 * double	-> Double
		 * char		-> Character
		 * boolean	-> Boolean
		 */

		int primInt = 9;
		Integer wrapperInt = 9; // this is auto-boxing
		
		String someNumber = "123";
		String someOtherNumber = "456";
		
		// a safer wasy to do string comparison to avoid
		// a NullPointerException
		if ("456".equals(someNumber)) {
			
		}
		
		System.out.println(someNumber + someOtherNumber);
		System.out.println(Integer.parseInt(someNumber) + Integer.parseInt(someOtherNumber));
		
		Integer anotherIntWrapper = Integer.valueOf(9);
		
//		boolean primitiveBoolean = null; // Primitives can't be null, so no null check needed
		Boolean someBoolean = null;
		
//		if (someBoolean == true) {
		
		// a safer wasy to do string comparison to avoid
		// a NullPointerException
		if (Boolean.TRUE.equals(someBoolean)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		long firstLong = 10L;
		long secondLong = 10L;
		
		if (firstLong == secondLong) {
			System.out.println("Primitive long comparison works!");
		} 
			
		Long firstLongWrapper = 10L;
		Long secondLongWrapper = 10L;
		
		// Don't use == for wrappers(only primitives), Use .equals()
		if (firstLongWrapper.equals(secondLongWrapper)) { 
			System.out.println("Object wrapper Long comparison works!");
				
		}
	}

}
