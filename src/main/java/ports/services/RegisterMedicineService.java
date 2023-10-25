package ports.services;

import domains.Medicine;

import javax.validation.ValidationException;

public interface RegisterMedicineService {

	Medicine execute(Medicine medicine) throws ValidationException;
}
