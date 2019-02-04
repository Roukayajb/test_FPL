package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class MessagePK  implements Serializable{
	
	private Long Idrecepteur;
	private Long Idemetteur;
	public Long getIdrecepteur() {
		return Idrecepteur;
	}
	public void setIdrecepteur(Long idrecepteur) {
		Idrecepteur = idrecepteur;
	}
	public Long getIdemetteur() {
		return Idemetteur;
	}
	public void setIdemetteur(Long idemetteur) {
		Idemetteur = idemetteur;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Idemetteur == null) ? 0 : Idemetteur.hashCode());
		result = prime * result + ((Idrecepteur == null) ? 0 : Idrecepteur.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MessagePK other = (MessagePK) obj;
		if (Idemetteur == null) {
			if (other.Idemetteur != null)
				return false;
		} else if (!Idemetteur.equals(other.Idemetteur))
			return false;
		if (Idrecepteur == null) {
			if (other.Idrecepteur != null)
				return false;
		} else if (!Idrecepteur.equals(other.Idrecepteur))
			return false;
		return true;
	}
	
}
