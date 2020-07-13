package Family.Book.Personen;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonenService {
	/**
	 * Initialisierung des Loggers und Variablen Deklaration um Logger schreiben zu
	 * koennen
	 */
	private static final Logger LOGGER = LogManager.getLogger(PersonenService.class);

	@Autowired
	PersonenRepository personenRepository;

	// Beziehung

	/**
	 * Alle gespeicherten Personen ausgeben lassen Zunaechst wird eine leere
	 * List @param Personenlist erstellt, dannach werden alle Personen aus dem
	 * Repository gesucht Personen werden nacheinander in die @param personenlist
	 * gespeichert Personenlist wird nachdem alle Personen gespeichert sind returned
	 */
	public List<Personen> getAllPersonen() {
		Iterator<Personen> it = personenRepository.findAll().iterator();
		ArrayList<Personen> result = new ArrayList<>();
		while (it.hasNext()) {
			result.add(it.next());
		}
		return result;
	}

	public Personen getPersonById(int id) {
		return personenRepository.findById(id).orElse(null);
	}

	/**
	 * @return Basismethoden zum erstellen, aendern, loeschen von Personen Zum
	 *         Dokumentieren - Logger
	 */

	public void createPerson(Personen personen) {
		personenRepository.save(personen);
		LOGGER.info("Person erstellt");
	}

	public void updatePerson(int id, Personen personen) {
		personenRepository.save(personen);
		LOGGER.info("Person geaendert");
	}

	public void deletePerson(int id) {
		personenRepository.deleteById(id);
		LOGGER.warn("Person gelöscht");
	}

	// Verwandt

	/**
	 * Alle gespeicherten PersonenOfVerwandPersonen ausgeben lassen Zunaechst wird
	 * eine leere List @param Personenlist erstellt, dannach werden alle Personen
	 * aus dem Repository gesucht ersonenOfVerwandPersonen werden nacheinander in
	 * die @param personenlist gespeichert Personenlist wird nachdem alle Personen
	 * gespeichert sind returned
	 */
	public List<Personen> getAllPersonenOfVerwandPersonen(String verwandPersonen) {
		return personenRepository.findByVerwandPersonen(verwandPersonen);
	}

	public List<Personen> getAllPersonenOfVerwandPersonen() {
		Iterator<Personen> it = personenRepository.findAll().iterator();
		ArrayList<Personen> result = new ArrayList<>();
		while (it.hasNext()) {
			result.add(it.next());
		}
		return result;
	}

	/**
	 * @return Basismethoden zum erstellen und aendern von Verwandte Zum
	 *         Dokumentieren - Logger
	 */
	public void createVerwand(Personen verwandPersonen) {
		personenRepository.save(verwandPersonen);
		LOGGER.info("Verwandt erstellt");

	}

	public void updateVerwand(int id, Personen verwandPersonen) {
		personenRepository.save(verwandPersonen);
		LOGGER.info("Verwandt geaendert");

	}

	// Freunde

	/**
	 * Alle gespeicherten PersonenOfFreundePersonenById ausgeben lassen Zunaechst
	 * wird eine leere List @param Personenlist erstellt, dannach werden alle
	 * Personen aus dem Repository gesucht PersonenOfFreundePersonenById werden
	 * nacheinander in die @param personenlist gespeichert Personenlist wird nachdem
	 * alle Personen gespeichert sind returned
	 */

	public List<Personen> getAllPersonenOfFreundePersonenById(String freundePersonen) {
		return personenRepository.findByFreundePersonen(freundePersonen);
	}

	public List<Personen> getAllPersonenOfFreundePersonen() {
		Iterator<Personen> it = personenRepository.findAll().iterator();
		ArrayList<Personen> result = new ArrayList<>();
		while (it.hasNext()) {
			result.add(it.next());
		}
		return result;
	}

	public List<Personen> getFreunde() {
		Iterator<Personen> it = personenRepository.findAll().iterator();
		ArrayList<Personen> result = new ArrayList<>();
		while (it.hasNext()) {
			result.add(it.next());
		}
		return result;
	}

	/**
	 * @return Basismethoden zum erstellen, aendern, loeschen von Freunde Zum
	 *         Dokumentieren - Logger
	 */

	public void createFreunde(Personen freundePersonen) {
		personenRepository.save(freundePersonen);
		LOGGER.info("Freund erstellt");

	}

	public void updateFreunde(int id, Personen freundePersonen) {
		personenRepository.save(freundePersonen);
		LOGGER.info("Freund geaendert");

	}

	public void deleteFreunde(int id, Personen freundePersonen) {
		personenRepository.delete(freundePersonen);
		LOGGER.warn("Freund geloescht");

	}

	// Bekannte

	/**
	 * Alle gespeicherten PersonenOfBekanntePersonen ausgeben lassen Zunaechst wird
	 * eine leere List @param Personenlist erstellt, dannach werden alle Personen
	 * aus dem Repository gesucht PersonenOfBekanntePersonen werden nacheinander in
	 * die @param personenlist gespeichert Personenlist wird nachdem alle Personen
	 * gespeichert sind returned
	 */

	public List<Personen> getAllPersonenOfBekanntePersonen(String bekanntePersonen) {
		return personenRepository.findByBekanntePersonen(bekanntePersonen);
	}

	public List<Personen> getAllPersonenOfBekanntePersonen() {
		Iterator<Personen> it = personenRepository.findAll().iterator();
		ArrayList<Personen> result = new ArrayList<>();
		while (it.hasNext()) {
			result.add(it.next());
		}
		return result;
	}

	/**
	 * @return Basismethoden zum erstellen und aendern von Bekannte Zum
	 *         Dokumentieren - Logger
	 */
	public void createBekannte(Personen bekanntePersonen) {
		personenRepository.save(bekanntePersonen);
		LOGGER.info("Bekannte erstellt");

	}

	public void updateBekannte(int id, Personen bekanntePersonen) {
		personenRepository.save(bekanntePersonen);
		LOGGER.info("Bekannte geaendert");

	}

}
