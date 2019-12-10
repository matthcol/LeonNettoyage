package com.formation.LeonNettoyage.persistence.entities;





import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Table(name="service")
@Entity
public class Skill {
	
	
	public Skill() {
		serviceOfCleaner = new HashSet<SkillOfCleaner>();
	}
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Colonne générée
	private Long id;
	@Column
	private String serviceName;
	@Column
	private Long price;
	
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_service_of_cleaner", referencedColumnName = "id")
	private Set<SkillOfCleaner> serviceOfCleaner;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	
}
