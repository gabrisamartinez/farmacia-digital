package mocks;

import com.zupedu.bancodigital.domain.Propose;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProposeMock {
	public static Propose create() {
		return new Propose()
		  .setAddress(AddressMock.create())
		  .setCompleteName("Gabrielly Gomes Martinez")
		  .setCpf("444.444.444-44")
		  .setEmail("gabrielly.martinez@zup.com.br");
	}
}
