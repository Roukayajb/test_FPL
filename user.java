package org.sid.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class user implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long IdUser;

private String Name;
private String email;
private String Password;
public Long getIdUser() {
	return IdUser;
}
public void setIdUser(Long idUser) {
	IdUser = idUser;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public user() {
	super();
}
public user(String name, String email, String password) {
	super();
	Name = name;
	this.email = email;
	Password = password;
}



	
}
