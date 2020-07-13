package Family.Book;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class LoginController { // MUSS WIE DIE JETZIGE KLASSE HEIßEN

	Logger log = LoggerFactory.getLogger(LoginController.class); // MUSS WIE DIE JETZIGE KLASSE HEIßEN

	@GetMapping("test")
	public String test() {
		return "test";
	}

	@RequestMapping("/")
	public void forwardToIndex(HttpServletResponse http) {
		try {
			http.sendRedirect("/indexlog.html");
			log.info("User on indexlog.html");
		} catch (IOException e) {
			log.error("IOException in ViewController forwardToIndex method: " + e);
		}
	}

	@GetMapping("login")
	public void login(HttpServletResponse http) {
		try {
			http.sendRedirect("/kontaktErstellen.html");
			log.info("Login succesful");
		} catch (IOException e) {
			log.error("IOException in Controller login method: " + e);
		}
	}

	@GetMapping("logout")
	public void logout(HttpServletResponse http) {
		try {
			http.sendRedirect("/indexlog.html");
		} catch (IOException e) {
			log.error("IOException in Controller logout method: " + e);
		}
	}
}
