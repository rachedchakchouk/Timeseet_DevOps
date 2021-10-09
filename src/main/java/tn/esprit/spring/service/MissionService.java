package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Employe;
import tn.esprit.spring.entity.Mission;



public interface MissionService  {


	int ajouterMission(Mission mission);
//
//	void affecterMissionADepartement(int missionId, int depId);
//
//	List<Mission> findAllMissionByEmployeJPQL(int employeId);
//
//	List<Employe> getAllEmployeByMission(int missionId);

	void deleteMission(int id);
	
	

}
