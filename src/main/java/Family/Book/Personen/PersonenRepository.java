package Family.Book.Personen;


import java.util.List;


import org.springframework.data.repository.CrudRepository;



public interface PersonenRepository extends CrudRepository<Personen, Integer> {
	
	//Verwandt
	public List<Personen> findByVerwandPersonen(String verwandPersonen);
	
	//Freunde
	public List<Personen> findByFreundePersonen(String freundePersonen);
	
	//Bekannte
	public List<Personen> findByBekanntePersonen(String bekanntePersonen);

}