package ReseauSocial;
import java.io.*;
import java.util.*;
public class Graphe {
	  int N;
	 public int[][] adj=new int[N][N];
	 public Membre[]tab1=new Membre[N];     // tab1 est le tableau des membres et N est le nombre
	                                        // de membres crees 
     

	 public Graphe(int N) {
	  this.N=N;
	  }
		    
	 
       
       // remplissage de la matrice adj par des 0 si les 2 sommets ne sonts pas des amis
       // sinon par la valeur 1
    public  void remplir_matrice_graphe( int N) {
    	
       for(int i=0;i<N;i++) {
    	   
    	   for(int k=0;k<N;k++) {
    		   if (i!=k ){
    			   
    		   if(tab1[i].mesAmis.contains(tab1[k])) {
    			   
    			   adj[i][k]=1;}
    		   else
    			   
    	       
    	       {
    	    	   adj[i][k]=0;
    	       
    	       
    		   }
       }
    	   }
    	   }
       
}
       
 public Membre recherche_personne_backtraking(int i,String nom,String prenom,int id,int N) {
	 
	 boolean v=false;        // i le sommet  a partir duquel on commence la recherche
	 int k=0;
	 
	 while (true) {
		 
		 k=k+1;
		 
		 if (tab1[i].id==id && tab1[i].Prenom==prenom && this.tab1[i].Nom==nom){ 
			 
			 System.out.println("vous avez trouvé la personne desiré");
		 	 return tab1[i];
		
		 }	 
    	 else
			 
			if (adj[i][k]==1) {
				
				if(k<N) {
					
					recherche_personne_backtraking(k+1,nom,prenom,id,N);
					return tab1[i];
				}
					else
						
						v=true;
			}
	 }
		if (k=N || i=N)
			break;
}
			 
				 
			 
			 
			 
			 
		
		 
		 
		 
		 
	 
	 
	 
	 
	 
 }
       

   
	
	
	


