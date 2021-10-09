package tn.esprit.spring.test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entity.Mission;
import tn.esprit.spring.repository.MissionRepository;
import tn.esprit.spring.service.MissionService;


@RunWith(SpringRunner.class)

@SpringBootTest

public class MissionServiceImplTest {

	
	
	
	private static final long DEFAULT_TIMEOUT = 10000;

	private static final Logger l = LogManager.getLogger(MissionServiceImplTest.class);
	
	@Autowired
	MissionService Ms ;
	
	
	@Autowired
	MissionRepository  Mr ;
	
	
	//l'ajout d'une mission test
	@Test(timeout = DEFAULT_TIMEOUT)

		public void testaddmission() {
			Mission mission = new Mission("mission 1","the new mission");
		Ms.ajouterMission(mission);
		l.info("addMission :" + mission);
		}
		
		
		
	
	//test du nombre des lignes dans la base il doit etre sup à 0
		@Test(timeout = DEFAULT_TIMEOUT)
		public void testListMission() {
		List<Mission> e = (List<Mission>) Mr.findAll();
		assertThat(e).size().isGreaterThan(0);
		l.info(e.size() + "> 0" );
		
		}
		
		
		
		
		//test de la methode count "le retour de la methode ne doit pas etre null".
		@Test
		public void testcountMissions() {
		long nbrM = Mr.count();
		assertNotNull(nbrM);
		l.info("Le Nombre des Missions est :" + nbrM );
		}
	
		

		//test de la supprission de mission id=2 .
		
		@Test(timeout = DEFAULT_TIMEOUT)
		public void deleteMission() {
			Mission mission = new Mission();
			int id = 2;
			Ms.deleteMission(id);
		}
		
		
}
