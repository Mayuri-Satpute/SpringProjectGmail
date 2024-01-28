package com.crud.meta.modelled;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Animal {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private  String contact;
  private String name;
  private String email;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Animal(Long id, String contact, String name, String email) {
	super();
	this.id = id;
	this.contact = contact;
	this.name = name;
	this.email = email;
}
public Animal() {
	super();
	// TODO Auto-generated constructor stub
}
	
	
}
