package Family.Book;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Die LoginController.java Klasse, ist die erste Klasse die beim Start des
 * Programmes durchgeführt wird
 *
 *
 */

@RestController
@CrossOrigin
public class LoginController {

	/**
	 * Initialisierung des LOGGER`s
	 */

	private static final Logger LOGGER = LogManager.getLogger(LoginController.class);

	/**
	 * 
	 * Bei korrekter Durchführung ohne Fehlermeldung, landet man auf der
	 * indexlog.html und bekommt in der Console die Logger-Info: "User on
	 * indexlog.html" falls nicht, dann erscheint in der Console die Logger.error
	 * Meldung "IOException in ViewController forwardToIndex method"
	 * 
	 */

	@RequestMapping("/")
	public void forwardToIndex(HttpServletResponse http) {
		try {
			http.sendRedirect("/indexlog.html");
			LOGGER.info("User on indexlog.html");
		} catch (IOException e) {
			LOGGER.error("IOException in ViewController forwardToIndex method: " + e);
		}
	}

	/**
	 * 
	 * Durch Klick auf den Button Login, meldet man sich ein - man gelangt auf die
	 * kontaktErstellen.html und in der Console erscheint die LOGGER.info "Login
	 * erfolgreich" falls nicht - erscheint in der Console die LOGGER.error Meldung
	 * "IOException in Controller login method"
	 * 
	 */

	@GetMapping("login")
	public void login(HttpServletResponse http) {
		try {
			http.sendRedirect("/kontaktErstellen.html");
			LOGGER.info("Login erfolgreich");
		} catch (IOException e) {
			LOGGER.error("IOException in Controller login method: " + e);
		}
	}

	/**
	 * 
	 * Durch Klick auf den Reiter Lagout in der Navigationleiste meldet man sich an
	 * - man gelangt auf die indexlog.html und in der Console erscheint die
	 * LOGGER.info "Logout war erfolgreich" falls nicht - erscheint in der Console
	 * die LOGGER.error Meldung "IOException in Controller logout method"
	 */

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
