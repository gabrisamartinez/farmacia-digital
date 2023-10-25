package mocks;

import com.zupedu.bancodigital.domain.Address;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AddressMock {

	public static Address create() {
		return new Address()
		  .setZipCode(89200050)
		  .setHouseNumber(220)
		  .setStreetName("Rua Timbalaiê")
		  .setComplement("Em frente à prefeitura.");
	}
}
