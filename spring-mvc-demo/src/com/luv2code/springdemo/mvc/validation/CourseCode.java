package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import  java.lang.annotation.ElementType;
import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.RetentionPolicy;

@Constraint(validatedBy= CourseCodeConstraintValidator.class)
@Target( {ElementType.METHOD , ElementType.FIELD} ) //where can you apply this annotation
@Retention(RetentionPolicy.RUNTIME)  //how much time to retain the annotation and process it at runtime
public @interface CourseCode {
	
	//define default course code
	public String value() default "LUV";

	//define default error message
	public String message() default "must start with LUV";
	
	//definre default groups
	public Class<?>[] groups() default{};
	
	//define default payloads
	public Class<? extends Payload>[] payload() default{};

}