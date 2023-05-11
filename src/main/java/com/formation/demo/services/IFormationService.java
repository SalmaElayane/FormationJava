package com.formation.demo.services;

import java.util.List;

import com.formation.demo.entities.FormationEntity;

public interface IFormationService {

	public List<FormationEntity> getAllFormation();
	public void deleteFormation(Long id);
	public FormationEntity saveFormation(FormationEntity f);
	public FormationEntity updateFormation(FormationEntity f);
	public FormationEntity getOneFormation(Long id);
	

}
