   package ReseauSocial;
	import java.util.ArrayList;
	import java.util.*;
  
	public class Groupe {

		
	public	String nom_groupe;
	public	int id_groupe;
	public  Date date_creation_groupe;
	public String genre_groupe;
	public Membre createur;
	public ArrayList<Membre>membres_groupe=new ArrayList();   // les membres de groupe
	public ArrayList<Membre>Admines_groupe=new ArrayList();    // les admines de groupe
	  
	    
	    public Groupe(String nom,int id,Date d,String genre,Membre m) {
	    	
	    	this.nom_groupe=nom;
	    	this.id_groupe=id;
	    	this.date_creation_groupe=d;
	    	this.genre_groupe=genre;
	    	this.createur=m;
	    	
	    	
	    	
	    }
	    
	    
	    public void showmembres()
	    {
	    	if(this.membres_groupe.size()==0) {
	    		
	    		System.out.println("vous avez pas encore des membres");
	    		
	    	}
	    	
	    	else {
	    		
	    		for(int i=0;i<this.membres_groupe.size();i++) {
	    			
	    			System.out.println("la personne"+this.membres_groupe.get(i)+"est menbre de ce groupe");
	    			
	    		}
	    		
	    	}
	    	
	    	
	    }
	    
	    
	    public void showadmines_groupe()
	    {
	    	if(this.Admines_groupe.size()==0) {
	    		
	    		System.out.println("vous avez pas encore des admines pour ce groupe");
	    		
	    	}
	    	
	    	else {
	    		
	    		for(int i=0;i<this.Admines_groupe.size();i++) {
	    			
	    			System.out.println("la personne"+this.Admines_groupe.get(i)+"est admine de ce groupe");
	    			
	    		}
	    		
	    	}
	    	
	    	
	    }
	    
	    
	    
	    		
	    		
	    		
	    		
	    	
	    	
	    	
	    
		

}
