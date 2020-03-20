package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String>
{

	private String coursePrefix;
	
	public void initialize(CourseCode theCourseCode) {
		coursePrefix=theCourseCode.value();
	}
	
	@Override                  //value entered in form by user
	public boolean isValid(String theCode, ConstraintValidatorContext context) {
		
		boolean result;
		if(theCode!=null) {
			result=theCode.startsWith(coursePrefix);
		
		}
		else {
			result=true;
		}
		
		return result;
	}
	
	
}
