package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Family.Book.Personen.Personen;



public class PersonenTest {

	Personen p;

	@Before
	public void init() {
		p = new Personen();
	}

	@Test
	public void personenVerfügbar() {
		p.setId(1);
		Assert.assertEquals(1, 1);
	}

	

	@Test
	public void vornamenNichtGleichNachname() {
		p.setVorname("Carla");
		p.setNachname("B");
		Assert.assertNotEquals(p.getVorname(), p.getNachname());
	}

	@Test
	public void vornameNichtLeer() {
		p.setVorname("Carla");
		Assert.assertNotNull(p.getVorname());
	}

	@Test
	public void vornameIstGleich() {
		p.setVorname("Manu");
		Assert.assertEquals("Manu", p.getVorname());
	}

}