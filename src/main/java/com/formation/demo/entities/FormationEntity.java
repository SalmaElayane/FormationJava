package com.formation.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "formation")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FormationEntity {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFormation")
	private Long id;
	private String titreFormation ;
	private String descriptions ;
	//@Column(name = "price")
	private String prix ;
	private Date dateDebut;
	private Date dateFin;
	
	

}
