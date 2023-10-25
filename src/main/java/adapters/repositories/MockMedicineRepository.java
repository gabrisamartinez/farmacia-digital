package adapters.repositories;

import domains.Medicine;
import org.springframework.stereotype.Component;
import ports.repositories.MedicineRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class MockMedicineRepository implements MedicineRepository {

	Map<String, Medicine> medicines = new HashMap<>();

	@Override
	public Medicine save(Medicine medicine) {

		final String uuid = UUID.randomUUID().toString();
		this.medicines.put(uuid, medicine);

		return this.medicines.get(uuid);
	}
}
