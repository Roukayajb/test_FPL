package org.sid.service;

import java.util.List;
import java.util.Optional;

import org.sid.entities.user;

public interface UserRepository {

	

	List<user> findAll();

	user save(user u);

	Optional<user> findById(Long idUser);

}
