package net.andreinc.jbvext.annotations.misc.validators;

import net.andreinc.jbvext.annotations.misc.InstanceOf;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class InstanceOfValidator implements ConstraintValidator<InstanceOf, Object> {

    private InstanceOf annotation;

    @Override
    public void initialize(InstanceOf constraintAnnotation) {
        this.annotation = constraintAnnotation;
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {

        if (null == value) {
            return false;
        }

        Class<?>[] classes = annotation.value();

        for(Class<?> cls : classes) {
            if (cls.isInstance(value)) {
                return true;
            }
        }

        return false;
    }
}
