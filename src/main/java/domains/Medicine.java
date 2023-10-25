package domains;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Accessors(chain = true)
public class Medicine {

	@NotNull
	private String name;
	private String categoryName;
	private Date manufacturingDate;
	private Date validateDate;

	@Valid
	@NotNull
	private Pharmaceutical pharmaceutical;
}
