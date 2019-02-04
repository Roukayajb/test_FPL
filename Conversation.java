package org.sid.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Conversation  implements Serializable{

	@EmbeddedId
	MessagePK messagePK;
	

	public user getEmetteur() {
		return emetteur;
	}

	public void setEmetteur(user emetteur) {
		this.emetteur = emetteur;
	}

	public user getRecepteur() {
		return recepteur;
	}

	public void setRecepteur(user recepteur) {
		this.recepteur = recepteur;
	}



	@ManyToOne 
    @JoinColumn(name="emetteur",referencedColumnName="IdUser",insertable=false,updatable=false)
    private user emetteur ;
    
    @ManyToOne 
    @JoinColumn(name="recepteur",referencedColumnName="IdUser",insertable=false,updatable=false)
    private user recepteur;
    
	public MessagePK getMessagePK() {
		return messagePK;
	}

	public void setMessagePK(MessagePK messagePK) {
		this.messagePK = messagePK;
	}



	public Conversation() {
		super();
	}

	
	

	
}
