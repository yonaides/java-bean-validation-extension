package net.andreinc.jbvext.annotations.misc.validators;

import net.andreinc.jbvext.annotations.misc.OneOfStrings;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidatorContext;

public class OneOfStringsValidator extends OneOfValidator<OneOfStrings, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return super.isValid(value, annotation.value(), StringUtils::equals, context);
    }
}
