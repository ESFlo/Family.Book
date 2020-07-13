package Family.Book.Personen;

import java.util.List;

/** Implementieren der Suchfunktion
 * und ermoeglicht alle Funktionen aus dem CrudRepository zuverwenden 
 * */

import org.springframework.data.repository.CrudRepository;

public interface PersonenRepository extends CrudRepository<Personen, Integer> {
	
	/** Implementieren der Suchfunktion
	  * und ermoeglicht alle Funktionen aus dem CrudRepository zuverwenden 
	  * */

	// Verwandt
	public List<Personen> findByVerwandPersonen(String verwandPersonen);

	// Freunde
	public List<Personen> findByFreundePersonen(String freundePersonen);

	// Bekannte
	public List<Personen> findByBekanntePersonen(String bekanntePersonen);

	public List<Personen> findByVorname(String vorname);

	public List<Personen> findByNachname(String nachname);

}
