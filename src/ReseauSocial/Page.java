package ReseauSocial;
import java.util.ArrayList;
import java.util.*;

public class Page {
	
public	String nom_page;
public	int id_page;
public  Date date_creation_page;
public String genre_page;
public Membre createur;
public ArrayList<Membre>Admines_page=new ArrayList();      // les admines de cette page
public ArrayList<Membre>likers=new ArrayList();
  
    
    public Page(String nom,int id,Date i,String genre,Membre m) {
    	
    	this.nom_page=nom;
    	this.id_page=id;
    	this.date_creation_page=i;
    	this.genre_page=genre;
    	this.createur=m;
    	
    	
    	
    }
    
    public void showlikers()
    {
    	if(this.likers.size()==0) {
    		
    		System.out.println("vous avez pas encore des likers");
    		
    	}
    	
    	else {
    		
    		for(int i=0;i<this.likers.size();i++) {
    			
    			System.out.println("la personne"+this.likers.get(i)+"a aimé cette page");
    			
    		}
    		
    	}
    	
    	
    }
    
    
    public void showadmines()
    {
    	if(this.Admines_page.size()==0) {
    		
    		System.out.println("vous avez pas encore des admines");
    		
    	}
    	
    	else {
    		
    		for(int i=0;i<this.Admines_page.size();i++) {
    			
    			System.out.println("la personne"+this.Admines_page.get(i)+"est admine de cette page");
    			
    		}
    		
    	}
    	
    	
    }
    
    
    
    		
    		
    		
    		
    	
    	
    	
    }
	


