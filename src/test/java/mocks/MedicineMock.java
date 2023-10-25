package mocks;

import domains.Medicine;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MedicineMock {
	public static Medicine create() {
		return new Medicine()
		  .setPharmaceutical(PharmaceuticalMock.create())
		  .setName("Penincilina")
		  .setCategoryName("Antibióticos")
		  .setManufacturingDate(new Date())
		  .setValidateDate(new Date());
	}
}
