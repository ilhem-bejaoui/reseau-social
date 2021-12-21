package ReseauSocial;
import java.util.ArrayList;
import java.util.Date;

public class Membre {
	
public	String Nom,Prenom;
public int id;
 
ArrayList<Membre> mesAmis=new ArrayList(); 

ArrayList<Page> mesPages_aim�es=new ArrayList();    
ArrayList<Groupe> mesGroupes_aim�s=new ArrayList(); 

ArrayList<Page> mesPages_cr�es=new ArrayList();
ArrayList<Groupe> mesGroupes_cr�s=new ArrayList();



ArrayList<Membre> mesadmines_pagecr�� =new ArrayList();
ArrayList<Membre> mesadmines_groupecr�� =new ArrayList();

ArrayList<Membre> mesdemandes =new ArrayList();
ArrayList<Membre> mesinvitations=new ArrayList();


ArrayList<Groupe> demande_groupes=new ArrayList(); // les groupes que je veux les rejoindre

ArrayList<Membre> Suggestion=new ArrayList();// les id des amis sugger�s par le reseau

ArrayList<Message> mur=new ArrayList();



public Membre(String Nom,String Prenom,int id) {
	this.Nom=Nom;
	this.Prenom=Prenom;
	this.id=id;
	
}


public void Envoyer_demande(Membre m) {
	      
	if(this.mesAmis.contains(m)) {
		
		System.out.println("vous etes deja des amis");}
		else if (this.mesinvitations.contains(m)) {
			System.out.println("la personne"+ m+"a deja vous a envoy� une invitation");
			
		}
		
		else {
			this.mesdemandes.add(m);
			m.mesinvitations.add(this);
		}
		
	}	

	

public void accepter_invitation(Membre m) {
	
	if (this.mesinvitations.contains(m)) {
		
		this.mesAmis.add(m);  // on ajoute m a la liste des amis de this
		m.mesAmis.add(this);    // on ajoute this a la liste des amis de membre m
	}
	
}


public void annuler_invitation(Membre m) {
		
  if(this.mesinvitations.contains(m)) {
	
	this.mesinvitations.remove(m);
	System.out.println("vous avez supprimer l'invitation de :"+m);
}
	
}


  public  void aimer(Page P) {
	  
	if(this.mesPages_aim�es.contains(P)) {
		  System.out.println("vous avez deja aim� cette page");
		  }
	
		  else {
			  mesPages_aim�es.add(P);
			  P.likers.add(this);
			  System.out.println("page ajout�s a votre liste des pages avec succees");
		  }
	 }
	                                 
  
  
  public void rejoindreGroupe(Groupe G) {
	          this.mesGroupes_aim�s.add(G);
	          G.membres_groupe.add(this);
		  }
		  
		  
	 
  public void publier_message(Date d,String ch,Membre m) {
	  
	  if(this.mesAmis.contains(m)) {
		  Message msg=new Message(d,m,ch);
		  m.mur.add(msg);
	  }
	  
	  else {
			  
			  System.out.println("vous ne pouvez pas poster des messsages sur le mur de "+m+"car vous etes pas des amis");
			  
		  }
		  
	  }
	  
  
  
  public void creer_Page( String nomPage,int id,Date x,String genre) {
	  
	  Page page=new Page( nomPage,id,x,genre,this);
	  this.mesPages_cr�es.add(page);
	  System.out.println("vous avez cr�� la page :"+page);
	  
  }
	  
	  
  
  
  public void creer_Groupe(String nom,int id,Date y ,String genre) {
	  Groupe groupe=new Groupe(nom,id,y,genre,this);
	  this.mesGroupes_cr�s.add(groupe);
	  groupe.membres_groupe.add(this);
	  
	  System.out.println("vous avez cr�� le groupe :"+groupe);
	  
  }
  
  
  
  
	  
public void ajouter_admin(Membre m,Groupe G) {
	        if(m.mesGroupes_aim�s.contains(G)) {
			this.mesadmines_groupecr��.add(m);
		    G.Admines_groupe.add(m);
		}
}
	  
public void supprimer_admin(Membre m, Groupe G){
	
	
	if(this.mesadmines_groupecr��.contains(m)) {
		
		this.mesadmines_groupecr��.remove(m);
		G.Admines_groupe.remove(m);
	}
	
}

public void ajouter_admin_page(Membre m,Page P)
{
	  if(m.mesPages_aim�es.contains(P)) {
			this.mesadmines_pagecr��.add(m);
		    P.Admines_page.add(m);
		}
	
	
}


public void supprimer_admin_page(Membre m, Page P){
	
	
	if(this.mesadmines_pagecr��.contains(m)) {
		
		this.mesadmines_pagecr��.remove(m);
		P.Admines_page.remove(m);
	}
	
}
	  
  
	
public void showSuggestion() {
	
	if(this.Suggestion.size()==0) {
		
		System.out.println("vous n'avez pas de suggestion");
		
	}
	else {
		
		for(int i=0;i<this.Suggestion.size();i++) {
			
			System.out.println("le reseau suggere"+this.Suggestion.get(i));
			
		}
		
	}
	
	
}
			
			
			
			
			
			
			
		
		
		
		

	
	
	
}
	



	  
  



	

