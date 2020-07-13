package Family.Book;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin
public class LoginController { // MUSS WIE DIE JETZIGE KLASSE HEIßEN

	private static final Logger LOGGER = LogManager.getLogger(LoginController.class);

	@GetMapping("test")
	public String test() {
		return "test";
	}

	@RequestMapping("/")
	public void forwardToIndex(HttpServletResponse http) {
		try {
			http.sendRedirect("/indexlog.html");
			LOGGER.info("User on indexlog.html");
		} catch (IOException e) {
			LOGGER.error("IOException in ViewController forwardToIndex method: " + e);
		}
	}

	@GetMapping("login")
	public void login(HttpServletResponse http) {
		try {
			http.sendRedirect("/kontaktErstellen.html");
			LOGGER.info("Login erfolgreich");
		} catch (IOException e) {
			LOGGER.error("IOException in Controller login method: " + e);
		}
	}

	@GetMapping("logout")
	public void logout(HttpServletResponse http) {
		try {
			http.sendRedirect("/indexlog.html");
			LOGGER.info("Logout war erfolgreich");
		} catch (IOException e) {
			LOGGER.error("IOException in Controller logout method: " + e);
		}
	}
}
