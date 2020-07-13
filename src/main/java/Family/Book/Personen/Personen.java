package Family.Book.Personen;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;







@Entity
public class Personen {

	@Id
	private int id;
	private String anrede;
	private String vorname;
	private String nachname;
	private String adresse;
	private String email;
	private String fon;
	private String mobil;
	
	//Verwand
	@ManyToMany
	private List<Personen> verwandPersonen;
	
	//Freunde
	@ManyToMany
	private List<Personen> freundePersonen;
	
	//Bekannt
	@ManyToMany
	private List<Personen> bekanntePersonen;
	
	public Personen() {}
	public Personen(int id) {
        super();
        this.id = id;
    }	
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
	
	//Verwand
	public List<Personen> getVerwandPersonen() {
		return verwandPersonen;
	}

	public void addVerwandPersonen(Personen p) {
		this.verwandPersonen.add(p);
	}
	
	//Freunde
	public List<Personen> getFreundePersonen() {
		return freundePersonen;
	}
	
	public void addFreundePersonen(Personen p) {
		this.freundePersonen.add(p);
	}
	
	//Bekannt
	public List<Personen> getBekanntePersonen() {
		return bekanntePersonen;
	}
		
	public void addBekanntePersonen(Personen p) {
		this.bekanntePersonen.add(p);
	}
}
