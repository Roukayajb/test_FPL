package org.sid.service;

import java.util.List;

import org.sid.entities.Conversation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversationRestService {

	@Autowired
	private ConversationRepository conversationRepository;
	
	
	
	@RequestMapping(value="/conversations", method=RequestMethod.GET)
	public List<Conversation> getAllMessage(){
		return conversationRepository.findAll();
	}
	
}
