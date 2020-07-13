package Family.Book.Personen;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Klasse Personen ist verantwortlich für das Anlegen neuer Personen
 */
@Entity
public class Personen {

	/**
	 * Attribute, die einer Person zugewiesen werden sollen
	 */
	@Id
	private int id;
	private String anrede;
	private String vorname;
	private String nachname;
	private String adresse;
	private String email;
	private String fon;
	private String mobil;
	
	/**
	 * Zum Anlegen einer Liste Verwandt
	 */
	//Verwandt
	@ManyToMany
	private List<Personen> verwandPersonen;
	
	/**
	 * Zum Anlegen einer Liste Freunde
	 */
	//Freunde
	@ManyToMany
	private List<Personen> freundePersonen;
	
	/**
	 * Zum Anlegen einer Liste Bekannt
	 */
	//Bekannt
	@ManyToMany
	private List<Personen> bekanntePersonen;
	
	/**
	 * Erstellen eines leeren Konstruktors
	 */
	public Personen() {}
	
	/**
	 * @param id
	 * Erstellen eines Konstruktors mit Uebergabe des Parameters id
	 */
	public Personen(int id) {
        super();
        this.id = id;
    }	
	
	/**
	 * @param id
	 * @param anrede
	 * @param vorname
	 * @param nachname
	 * @param adresse
	 * @param email
	 * @param fon
	 * @param mobil
	 * Uebergabe der Paramter der Person
	 */
	public Personen(int id, String anrede, String vorname, String nachname, String adresse, String email, String fon,
			String mobil) {
		super();
		this.id = id;
		this.anrede = anrede;
		this.vorname = vorname;
		this.nachname = nachname;
		this.adresse = adresse;
		this.email = email;
		this.fon = fon;
		this.mobil = mobil;
	}

	/**
	 * @return
	 * Setter und Getter zum Uebergeben sowie Abrufen von Werten
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnrede() {
		return anrede;
	}

	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFon() {
		return fon;
	}

	public void setFon(String fon) {
		this.fon = fon;
	}

	public String getMobil() {
		return mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}
	
	/**
	 * @return
	 * Abfrage der Liste Personen Verwandt
	 */
	//Verwandt
	public List<Personen> getVerwandPersonen() {
		return verwandPersonen;
	}

	/**
	 * @param p
	 * Parameter p wird uebergeben
	 */
	public void addVerwandPersonen(Personen p) {
		this.verwandPersonen.add(p);
	}
	
	/**
	 * @return
	 * Abfrage der Liste Personen befreundet
	 */
	//Freunde
	public List<Personen> getFreundePersonen() {
		return freundePersonen;
	}
	
	/**
	 * @param p
	 * Parameter p wird uebergeben
	 */
	public void addFreundePersonen(Personen p) {
		this.freundePersonen.add(p);
	}
	
	/**
	 * @return
	 * Abfrage der Liste Personen bekannt
	 */
	//Bekannt
	public List<Personen> getBekanntePersonen() {
		return bekanntePersonen;
	}
	
	/**
	 * @param p
	 * Parameter p wird uebergeben
	 */
	public void addBekanntePersonen(Personen p) {
		this.bekanntePersonen.add(p);
	}
}
