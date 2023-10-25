package adapters.validation;

import javax.validation.*;
import java.util.Set;

public class ValidatorImplementation {
	public static void validate(Object objToValidate) throws ValidationException {
		final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		final Validator validator = factory.getValidator();

		Set<ConstraintViolation<Object>> violation = validator.validate(objToValidate);

		if(violation.stream().findAny().isPresent())
			throw new ValidationException(violation.stream().findFirst().get().getMessage());
	}
}
