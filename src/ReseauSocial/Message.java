package ReseauSocial;

import java.util.Date;

public class Message {
	
	Date date;
	Membre auteur;
	String contenu;
	
	
	public Message(Date d,Membre m,String chaine) {
		
		this.date=d;
		this.auteur=m;
		this.contenu=chaine;
	}

}
