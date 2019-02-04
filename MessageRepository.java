package org.sid.service;

import java.util.List;

import org.sid.entities.Message;

public interface MessageRepository {

	List<Message> findAll();

	List<Message> getMsgByConversation(Long idEmetteur, Long idRecepteur);

	void save(Message m);

	List<Message> getAllMsgByConversation(Long idEmetteur, Long idRecepteur);

}
