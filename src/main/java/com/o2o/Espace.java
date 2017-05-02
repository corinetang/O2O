package com.o2o;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Espace {
	int id;
	int superficie;
	TypeEspace type;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getSuperficie() {
		return superficie;
	}
	
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	public TypeEspace getType() {
		return type;
	}
	
	public void setType(TypeEspace type) {
		this.type = type;
	}
}
