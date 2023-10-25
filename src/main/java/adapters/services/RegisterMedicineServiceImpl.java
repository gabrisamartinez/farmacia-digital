package adapters.services;

import adapters.validation.ValidatorImplementation;
import domains.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ports.repositories.MedicineRepository;
import ports.services.RegisterMedicineService;

@Service
public class RegisterMedicineServiceImpl implements RegisterMedicineService {

	private final MedicineRepository medicineRepository;

	@Autowired
	public RegisterMedicineServiceImpl(MedicineRepository medicineRepository) {
		this.medicineRepository = medicineRepository;
	}

	@Override
	public Medicine execute(Medicine medicine) {
		ValidatorImplementation.validate(medicine);
		return this.medicineRepository.save(medicine);
	}
}
