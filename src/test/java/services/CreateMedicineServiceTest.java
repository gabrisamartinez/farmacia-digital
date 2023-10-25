package services;

import adapters.repositories.MockMedicineRepository;
import adapters.services.RegisterMedicineServiceImpl;
import domains.Medicine;
import mocks.MedicineMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ports.services.RegisterMedicineService;

import javax.validation.ValidationException;

public class CreateMedicineServiceTest {

	private final RegisterMedicineService registerMedicineService = new RegisterMedicineServiceImpl(new MockMedicineRepository());

	@Test
	public void shouldRegisterMedicine() throws javax.xml.bind.ValidationException {
		final Medicine medicine = MedicineMock.create();

		final Medicine createdMedicine = this.registerMedicineService.execute(medicine);

		Assertions.assertEquals(medicine, createdMedicine);
	}

	@Test
	public void shouldNotRegisterMedicineWithoutName() {
		final Medicine medicine = MedicineMock.create();
		medicine.setName(null);
		Assertions.assertThrows(ValidationException.class, () -> this.registerMedicineService.execute(medicine));
	}

	@Test
	public void shouldNotRegisterMedicineWithoutPharmaceutical() {
		final Medicine medicine = MedicineMock.create();
		medicine.setPharmaceutical(null);
		Assertions.assertThrows(ValidationException.class, () -> this.registerMedicineService.execute(medicine));
	}
}
