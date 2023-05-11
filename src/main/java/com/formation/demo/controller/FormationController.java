package com.formation.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.demo.entities.FormationEntity;
import com.formation.demo.services.IFormationService;

@RestController
@RequestMapping(value = "/api-formation")
public class FormationController {
	
	@Autowired
	private IFormationService formationService;
	
	@GetMapping(value = "/v0")
	public List<FormationEntity> getAllFormation(){
		List<FormationEntity> formation=formationService.getAllFormation();
	return	formation;
	}
	
	@PostMapping(value = "/v0")
	public FormationEntity saveFormation(@RequestBody FormationEntity f) {
		FormationEntity save=formationService.saveFormation(f);
		return save;
	}
	
	@DeleteMapping(value = "formation/{id}")
	public void deleteFormation(@PathVariable Long id) {
		 formationService.deleteFormation(id);
	}
	@GetMapping(value = "/formations/{id}")
	public FormationEntity getFormationById(@PathVariable Long id) {
		FormationEntity g=formationService.getOneFormation(id);
		return g ;
	}
	@PutMapping(value = "formation/{id}")
	public FormationEntity updateFormation(@PathVariable Long id,@RequestBody FormationEntity f)  {
		return formationService.updateFormation(f);
	}
	
}
