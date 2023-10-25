package mocks;

import domains.Pharmaceutical;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PharmaceuticalMock {

	public static Pharmaceutical create() {
		return new Pharmaceutical().setName("Juliana").setCredential("ABC123");
	}
}
