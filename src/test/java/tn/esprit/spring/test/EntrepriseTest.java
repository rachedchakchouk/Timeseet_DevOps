package tn.esprit.spring.test;


import static org.junit.Assert.*;

import java.text.ParseException;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.EntrepriseRepository;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class EntrepriseTest {
	
	@Autowired
	  private TestEntityManager entityManager;

	  @Autowired
	  EntrepriseRepository erep;
	  
	  @Test
	  public void testAddEntreprise() throws ParseException {

	 Entreprise e = new Entreprise("Google","GG");
	  
	  Entreprise savedEntreprise = erep.save(e);
	  assertNotNull(savedEntreprise);
	  }
	  
}