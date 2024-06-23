package com.example.identity_service.validator;

import com.example.identity_service.exception.ErrorCode;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {DobValidator.class})
public @interface DobConstraint {
    String message() default "invalid date of birth";


    int min();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}