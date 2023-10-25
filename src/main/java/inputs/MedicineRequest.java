package inputs;

import domains.Medicine;
import domains.Pharmaceutical;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class MedicineRequest implements IMedicine {

	@NotNull
	private String name;

	@NotNull
	private String categoryName;

	@NotNull
	private Date manufacturingDate;

	@NotNull
	private Date validateDate;

	@NotNull
	private String pharmaceuticalName;

	@NotNull
	private String pharmaceuticalCredential;

	@Override
	public Medicine toModel() {
		return new Medicine()
		  .setName(name)
		  .setCategoryName(categoryName)
		  .setManufacturingDate(manufacturingDate)
		  .setValidateDate(validateDate)
		  .setPharmaceutical(
			new Pharmaceutical(pharmaceuticalName, pharmaceuticalCredential)
		  );
	}
}
