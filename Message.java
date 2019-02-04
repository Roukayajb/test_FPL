package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdMessage;
    private String MsgContain;
    
    @Temporal(TemporalType.DATE)
	private Date dateMessage;
    
	@ManyToOne
	private Conversation conversation;
	
	public String getMsgContain() {
		return MsgContain;
	}
	public void setMsgContain(String msgContain) {
		MsgContain = msgContain;
	}

	public Date getDateMessage() {
		return dateMessage;
	}
	public void setDateMessage(Date dateMessage) {
		this.dateMessage = dateMessage;
	}
	public Conversation getConversation() {
		return conversation;
	}
	public void setConversation(Conversation conversation) {
		this.conversation = conversation;
	}

	public Message() {
		super();
	}
	public Message(String msgContain, Date dateMessage) {
		super();
		MsgContain = msgContain;
		this.dateMessage = dateMessage;
		
	}
	
	
	
}
