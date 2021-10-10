
package tn.esprit.spring.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import org.springframework.test.context.junit4.SpringRunner;


import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.repository.DepartementRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class DepartementTest {
	

	  @Autowired
	  DepartementRepository drep;
	  
	  private static final Logger l = LogManager.getLogger(DepartementTest.class);
	  
	  @Test
	  public void testAddDepartement() throws ParseException {

	 Departement d = new Departement("DEP A");
	  
	 Departement savedDepartement = drep.save(d);
	  assertNotNull(savedDepartement);
	  }
	  
	  
	  @Test
	  public void testUpdate () {
	   Departement d = drep.findById(1);
	  	d.setName("DEP A");
	  	drep.save(d);
	  }
	  
	
	  
	  @Test
	  public void testDelete () {
	  	drep.deleteById(1);
	  	assertThat(drep.existsById(1)).isFalse();
	  }
	 
	  
}