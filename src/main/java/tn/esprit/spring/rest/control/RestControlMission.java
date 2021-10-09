package tn.esprit.spring.rest.control;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Employe;
import tn.esprit.spring.entity.Mission;
import tn.esprit.spring.repository.MissionRepository;
import tn.esprit.spring.service.IEmployeService;
//import tn.esprit.spring.service.IEntrepriseService;
//import tn.esprit.spring.service.ITimesheetService;
import tn.esprit.spring.service.MissionService;
@RestController
public class RestControlMission {
	
	
	@Autowired
	MissionRepository mR ;
	
	

	
	@Autowired
	IEmployeService iemployeservice;
//	@Autowired
//	IEntrepriseService ientrepriseservice;
//	@Autowired
//	ITimesheetService itimesheetservice;
	
	@Autowired
	MissionService MS ;
	
	
	


	
	
	
	// http://localhost:8081/SpringMVC/servlet/ajouterMission
	//{"id":4,"name":"mamission", "description":"c ma mission"}
	@PostMapping("/ajouterMission")
	@ResponseBody
	public Mission ajouterMission(@RequestBody Mission mission) 
	{
		MS.ajouterMission(mission);
		return mission ;
	}
//
//	// http://localhost:8081/SpringMVC/servlet/affecterMissionADepartement/4/4
//	@PutMapping(value = "/affecterMissionADepartement/{idmission}/{iddept}") 
//	public void affecterMissionADepartement(@PathVariable("idmission") int missionId, @PathVariable("iddept") int depId) {
//		MS.affecterMissionADepartement(missionId, depId);
//
//	}
//	
//	// http://localhost:8081/SpringMVC/servlet/ajouterTimesheet
//    //{"missionId":1,"employeId":2,"dateDebut":"2020-03-01","dateFin":"2021-03-01"}
//	
//	@PostMapping("/ajouterTimesheet/idmission/idemp/dated/datef")
//	@ResponseBody
//	public void ajouterTimesheet(@PathVariable("idmission") int missionId, @PathVariable("idemp") int employeId, @PathVariable("dated") Date dateDebut,@PathVariable("datef") Date dateFin) {
//		itimesheetservice.ajouterTimesheet(missionId, employeId, dateDebut, dateFin);
//
//	}
//
//	// http://localhost:8081/SpringMVC/servlet/affecterMissionADepartement/4/4
//	@PutMapping(value = "/validerTimesheet/{idmission}/{iddept}") 
//	public void validerTimesheet(int missionId, int employeId, Date dateDebut, Date dateFin, int validateurId) {
//		itimesheetservice.validerTimesheet(missionId, employeId, dateDebut, dateFin, validateurId);
//
//	}
//	
//	// URL : http://localhost:8081/SpringMVC/servlet/findAllMissionByEmployeJPQL/1
//    @GetMapping(value = "findAllMissionByEmployeJPQL/{idemp}")
//    @ResponseBody
//	public List<Mission> findAllMissionByEmployeJPQL(@PathVariable("idemp") int employeId) {
//
//		return MS.findAllMissionByEmployeJPQL(employeId);
//	}
//
//    // URL : http://localhost:8081/SpringMVC/servlet/getAllEmployeByMission/1
//    @GetMapping(value = "getAllEmployeByMission/{idmission}")
//    @ResponseBody
//	public List<Employe> getAllEmployeByMission(@PathVariable("idmission") int missionId) {
//
//		return MS.getAllEmployeByMission(missionId);
//	}
//	
    

	@DeleteMapping(value = "/deleteMission/{id}")
	public void deleteMission(@PathVariable("id") int id) {
		MS.deleteMission(id);	}
    
	
}
