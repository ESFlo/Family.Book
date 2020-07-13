package test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.Answer;
import org.springframework.boot.test.context.SpringBootTest;

import familienbuch.anwendung.personen.Personen;
import familienbuch.anwendung.personen.PersonenRepository;
import familienbuch.anwendung.personen.PersonenService;

@SpringBootTest
public class PersonenMockitoTest {

	@Mock
	PersonenRepository personenRepository;

	@InjectMocks
	PersonenService personenService;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);

		Personen p1 = new Personen(1, "Frau", "Manu", "G", "AAweg", "abc@web,de", "8787987", "7889879");
		List<Personen> found = Lists.list(p1);
		when(personenRepository.findByVorname("Manu")).thenReturn(found);
		when(personenRepository.findByNachname(null)).thenReturn(Collections.emptyList());
	}

	@Test
	public void didNotFindAPerson() {
		List<Personen> check = personenRepository.findByVorname("NameNotInRepository");
		assertThat(check.isEmpty()).isTrue();
		check = personenRepository.findByVorname(null);
		assertThat(check.isEmpty()).isTrue();
	}

	@Test
	public void foundOnePerson() {
		List<Personen> check = personenRepository.findByVorname("Manu");
		assertThat(check.size()).isEqualTo(1);

		Personen p = check.get(0);
		assertThat(p.getVorname()).isEqualTo("Manu");
	}

	@Test
	public void foundManyPersons() {
		// TODO
	}

}
