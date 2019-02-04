package org.sid.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.sid.entities.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class UserRestService {

	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<user> getAllUsers(){
		return userRepository.findAll();
	}

		@RequestMapping(value="/OtherUsers/{userId}", method=RequestMethod.GET)
		public List<user> getOtherUsers(@PathVariable Long userId){
			List<user> other=new ArrayList<>();
			List<user> allUser=userRepository.findAll();
			for(user us:allUser) {
				if(us.getIdUser()!=userId) {
					other.add(us);
				}
			}
			return other;
			
		}
	
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public user saveUser(@RequestBody user u) {
		return userRepository.save(u);
	}
	
	@RequestMapping(value="/getUser/{idUser}", method=RequestMethod.GET)
	public Optional<user> getUserById(@PathVariable Long idUser){
		return userRepository.findById(idUser);
	}
	

	
	

}
