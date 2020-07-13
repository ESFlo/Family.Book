package Family.Book;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @return
 * Die Klasse TestController mit der Methode test() wurde am Anfang des
 * Projektes zur Überprüfung hinzugefügt
 *
 */

@RestController
public class TestController {

	@RequestMapping("/test")
	public String test() {
		return "Test hat funktioniert";
	}

}
