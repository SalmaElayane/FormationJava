package com.formation.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.demo.entities.FormationEntity;

@Repository
public interface IFormationRepository extends JpaRepository<FormationEntity, Long> {

}
