package org.sid.service;

import java.util.List;

import org.sid.entities.Conversation;

public interface ConversationRepository {

	Conversation getConversationByUser(Long idEmetteur, Long idRecepteur);

	void save(Conversation c);

	List<Conversation> findAll();

}
