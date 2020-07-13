package Family.Book.Personen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class PersonenController {
	
	@Autowired
	PersonenService personenService;
	
	@RequestMapping(method = RequestMethod.GET, value="/personen")
	public List<Personen> getAllPersonen() {
		return personenService.getAllPersonen();
	}
	@RequestMapping(method=RequestMethod.GET, value="/personen/{id}")
	public Personen getPersonById(@PathVariable int id) {
		return personenService.getPersonById(id);
	}
	@RequestMapping(method= RequestMethod.POST, value="/personen")
	public void createPerson(@RequestBody Personen personen) {
		personenService.createPerson(personen);
	}
	@RequestMapping(method= RequestMethod.PUT, value="/personen/{id}")
	public void updatePerson(@PathVariable int id, @RequestBody Personen personen) {
		personenService.updatePerson(id, personen);
	}
	@RequestMapping(method= RequestMethod.DELETE, value="/personen/{id}")
	public void deletePerson(@PathVariable int id) {
		personenService.deletePerson(id);
	}
	
	//Verwand
	@RequestMapping("/personenbyverwandPersonen/{verwandPersonen}")
	public List<Personen> getAllPersonenByverwandPersonen(@PathVariable String verwandPersonen) {
		return personenService.getAllPersonenOfVerwandPersonen(verwandPersonen);
	}

	@RequestMapping(method = RequestMethod.GET, value="/personenbyverwandPersonen")
	public List<Personen> getAllPersonenByverwandPersonen() {
		return personenService.getAllPersonenOfVerwandPersonen();
	}
	
	@RequestMapping(method= RequestMethod.POST, value="/personenbyverwandPersonen")
	public void createVerwand(@RequestBody Personen verwandPersonen) {
		personenService.createVerwand(verwandPersonen);
	}
	
	@RequestMapping(method= RequestMethod.PUT, value="/personenbyverwandPersonen/{id}")
	public void updateVerwand(@PathVariable int id, @RequestBody Personen verwandPersonen) {
		personenService.updateVerwand(id, verwandPersonen);
	}
	
	//Freunde
	@RequestMapping("/personenbyfreundePersonen/{freundePersonen}")
	public List<Personen> getAllPersonenByfreundePersonen(@PathVariable String freundePersonen) {
		return personenService.getAllPersonenOfFreundePersonenById(freundePersonen);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/personenbyfreundePersonen")
	public List<Personen> getAllPersonenByfreundePersonen() {
		return personenService.getAllPersonenOfFreundePersonen();
	}
	
	@RequestMapping(method= RequestMethod.POST, value="/personenbyfreundePersonen")
	public void createFreunde(@RequestBody Personen freundePersonen) {
		personenService.createFreunde(freundePersonen);
	}
	
	@RequestMapping(method= RequestMethod.PUT, value="/personenbyfreundePersonen/{id}")
	public void updateFreunde(@PathVariable int id, @RequestBody Personen freundePersonen) {
		personenService.updateFreunde(id, freundePersonen);
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value="/personenbyfreundePersonen/{id}")
	public void deleteFreunde(@PathVariable int id, @RequestBody Personen freundePersonen) {
		personenService.deleteFreunde(id,freundePersonen);
	}
	
	//Bekannte
	@RequestMapping("/personenbybekanntePersonen/{bekanntePersonen}")
	public List<Personen> getAllPersonenBybekanntePersonen(@PathVariable String bekanntePersonen) {
		return personenService.getAllPersonenOfBekanntePersonen(bekanntePersonen);
	}

	@RequestMapping(method = RequestMethod.GET, value="/personenbybekanntePersonen")
	public List<Personen> getAllPersonenBybekanntePersonen() {
		return personenService.getAllPersonenOfBekanntePersonen();
	}
	
	@RequestMapping(method= RequestMethod.POST, value="/personenbybekanntePersonen")
	public void createBekannte(@RequestBody Personen bekanntePersonen) {
		personenService.createBekannte(bekanntePersonen);
	}
	
	@RequestMapping(method= RequestMethod.PUT, value="/personenbybekanntePersonen/{id}")
	public void bekannteFreunde(@PathVariable int id, @RequestBody Personen bekanntePersonen) {
		personenService.updateBekannte(id, bekanntePersonen);
	}
	
	
	@RequestMapping(method= RequestMethod.GET, value ="/PersonenFreundePersonenTable")
	public List<Personen> freundePersonen(){
		return personenService.getFreunde();
	}
	
	
	
	
		
}
