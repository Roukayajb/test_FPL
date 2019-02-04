package org.sid.service;

import java.util.Date;
import java.util.List;

import org.sid.entities.Conversation;
import org.sid.entities.Message;
import org.sid.entities.MessagePK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public abstract class MessageRestService {
	@Autowired
	private MessageRepository messageRepository;
	
	@Autowired
	private ConversationRepository conversationRepository;
	
	@RequestMapping(value="/messages", method=RequestMethod.GET)
	public List<Message> getAllMessage(){
		return messageRepository.findAll();
	}
	
	
	@RequestMapping(value="/messagesByConversation/{idRecepteur}/{idEmetteur}", method=RequestMethod.GET)
	public List<Message> getMsgByConversation(@PathVariable Long idEmetteur,@PathVariable Long idRecepteur){
		//return c.getMessages();
		return messageRepository.getMsgByConversation(idEmetteur,idRecepteur);
	}
	
	
	@RequestMapping(value="/addMessage/{idEmetteur}/{idRecepteur}", method=RequestMethod.POST)
	public Message addMessage(@RequestBody Message m,@PathVariable Long idEmetteur, @PathVariable Long idRecepteur) {
		
		Conversation c=conversationRepository.getConversationByUser(idEmetteur,idRecepteur);
		if(c!=null) {
			
			
			    m.setConversation(c);
				m.setDateMessage(new Date());
				messageRepository.save(m);
				//c.getMessages().add(m);
				
				return m;}
		else {	
			MessagePK msg=new MessagePK();
			msg.setIdemetteur(idEmetteur);
			msg.setIdrecepteur(idRecepteur);
			
			c=new Conversation();
			c.setMessagePK(msg);
			conversationRepository.save(c);
			
			m.setConversation(c);
			m.setDateMessage(new Date());
			messageRepository.save(m);
				return m;
		}
		
		
	   
		
	}
	
	@RequestMapping(value="/getAllMsgByConversation/{idRecepteur}/{idEmetteur}", method=RequestMethod.GET)
	public List<Message> getAllMsgByConversation(@PathVariable Long idEmetteur, @PathVariable  Long idRecepteur){
		return messageRepository.getAllMsgByConversation(idEmetteur, idRecepteur);
	}

	
	
}
