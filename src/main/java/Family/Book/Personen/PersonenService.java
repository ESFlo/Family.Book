package Family.Book.Personen;


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class PersonenService {
	
	@Autowired
	PersonenRepository personenRepository;
	
	//Beziehung
	public List<Personen> getAllPersonen() {
		Iterator<Personen> it = personenRepository.findAll().iterator();
		ArrayList<Personen> result = new ArrayList<>();
		while(it.hasNext()) {
			result.add(it.next());
		}
		return result;
	}
	
	
	public Personen getPersonById(int id) {
		return personenRepository.findById(id).orElse(null);
	}
	
	public void createPerson(Personen personen) {
		personenRepository.save(personen);
	}
	
	public void updatePerson(int id, Personen personen) {
		personenRepository.save(personen);
	}
	
	public void deletePerson(int id) {
		personenRepository.deleteById(id);
	}
	
	//Verwand
	public List<Personen> getAllPersonenOfVerwandPersonen(String verwandPersonen) {
		return personenRepository.findByVerwandPersonen(verwandPersonen);
	}

	public List<Personen> getAllPersonenOfVerwandPersonen() {
		Iterator<Personen> it = personenRepository.findAll().iterator();
		ArrayList<Personen> result = new ArrayList<>();
		while(it.hasNext()) {
			result.add(it.next());
		}
		return result;	}

	public void createVerwand(Personen verwandPersonen) {
		personenRepository.save(verwandPersonen);
		
	}
	
	public void updateVerwand(int id, Personen verwandPersonen) {
		personenRepository.save(verwandPersonen);
		
	}
	//Freunde
	public List<Personen> getAllPersonenOfFreundePersonenById(String freundePersonen){
		return personenRepository.findByFreundePersonen(freundePersonen);
	}
	
	public List<Personen> getAllPersonenOfFreundePersonen() {
		Iterator<Personen> it = personenRepository.findAll().iterator();
		ArrayList<Personen> result = new ArrayList<>();
		while(it.hasNext()) {
			result.add(it.next());
		}
		return result;	}
	public List<Personen> getFreunde() {
		Iterator<Personen> it = personenRepository.findAll().iterator();
		ArrayList<Personen> result = new ArrayList<>();
		while(it.hasNext()) {
			result.add(it.next());
		}
		return result;	}
	public void createFreunde(Personen freundePersonen) {
		personenRepository.save(freundePersonen);
		
	}
	
	public void updateFreunde(int id, Personen freundePersonen) {
		personenRepository.save(freundePersonen);
		
	}
	
	public void deleteFreunde(int id,Personen freundePersonen) {
		personenRepository.delete(freundePersonen);
		
	}
	
	//Bekannte
	public List<Personen> getAllPersonenOfBekanntePersonen(String bekanntePersonen){
		return personenRepository.findByBekanntePersonen(bekanntePersonen);
	}

	public List<Personen> getAllPersonenOfBekanntePersonen() {
		Iterator<Personen> it = personenRepository.findAll().iterator();
		ArrayList<Personen> result = new ArrayList<>();
		while(it.hasNext()) {
			result.add(it.next());
		}
		return result;	}

	public void createBekannte(Personen bekanntePersonen) {
		personenRepository.save(bekanntePersonen);
		
	}
	
	public void updateBekannte(int id, Personen bekanntePersonen) {
		personenRepository.save(bekanntePersonen);
		
	}

	


	


	


	

}
