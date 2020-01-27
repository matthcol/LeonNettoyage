package exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ContractNotFoundException extends RuntimeException{


	private static final long serialVersionUID = 1L;

	public ContractNotFoundException(String message) {
		super(message);
		System.out.println("Specified contract number is unknown");
	
	}
	
}
