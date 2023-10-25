package applications;

import domains.Medicine;
import inputs.MedicineRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;
import ports.services.RegisterMedicineService;

import javax.validation.Valid;
import java.net.URI;

@Controller
@RequestMapping("/register/medicine")
public class RegisterMedicineController {

	private final RegisterMedicineService registerMedicineService;

	@Autowired
	public RegisterMedicineController(RegisterMedicineService registerMedicineService) {
		this.registerMedicineService = registerMedicineService;
	}

	@PostMapping
	public ResponseEntity<?> save(@RequestBody @Valid MedicineRequest medicineRequest,
	                              UriComponentsBuilder uriBuilder){

		final Medicine registeredMedicine = this.registerMedicineService.execute(medicineRequest.toModel());

		URI location = uriBuilder.path("/register/{name}")
		  .buildAndExpand(registeredMedicine.getName())
		  .toUri();

		return ResponseEntity.created(location).build();
	}
}
