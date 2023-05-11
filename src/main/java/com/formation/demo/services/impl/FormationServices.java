package com.formation.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.demo.entities.FormationEntity;
import com.formation.demo.repository.IFormationRepository;
import com.formation.demo.services.IFormationService;

@Service
public class FormationServices implements IFormationService{

	@Autowired
	private IFormationRepository formationRepository;

	@Override
	public List<FormationEntity> getAllFormation() {
		// TODO Auto-generated method stub
		return formationRepository.findAll();
	}

	@Override
	public void deleteFormation(Long id) {
		formationRepository.deleteById(id);
		
	}

	@Override
	public FormationEntity saveFormation(FormationEntity f) {
		// TODO Auto-generated method stub
		return formationRepository.save(f);
	}

	@Override
	public FormationEntity updateFormation(FormationEntity f) {
		// TODO Auto-generated method stub
		return formationRepository.save(f);
	}

	@Override
	public FormationEntity getOneFormation(Long id) {
		FormationEntity f=formationRepository.findById(id).orElse(new FormationEntity());
		return f;
	}
	


	
	

}
