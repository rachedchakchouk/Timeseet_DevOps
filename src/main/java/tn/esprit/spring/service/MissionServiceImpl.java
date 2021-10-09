package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Departement;
import tn.esprit.spring.entity.Employe;
import tn.esprit.spring.entity.Mission;
import tn.esprit.spring.repository.MissionRepository;


@Service
public class MissionServiceImpl implements MissionService {
	
	@Autowired
	MissionRepository MR ;
	
	
	
//	
//	@Autowired
//	DepartementRepository DR ;
//	
//	@Autowired
//	TimesheetRepository TR ;

		
		
		
		
		@Override
		public int ajouterMission(Mission mission) {
			MR.save(mission);
			return mission.getIdMission();
		}
	    
		
//		@Override
//		public void affecterMissionADepartement(int missionId, int depId) {
//			Mission mission = MR.findById(missionId).get();
//			Departement dep = DR.findById(depId).get();
//			mission.setDepartement(dep);
//			MR.save(mission);
//			
//		}
		
		
		
		
//		
//		@Override
//		public List<Mission> findAllMissionByEmployeJPQL(int employeId) {
//			return TR.findAllMissionByEmployeJPQL(employeId);
//		}
//
//		@Override
//		public List<Employe> getAllEmployeByMission(int missionId) {
//			return TR.getAllEmployeByMission(missionId);
//		}
//		
		@Override
		public void deleteMission(int id) {
			MR.deleteById(id);

		}
	
}

