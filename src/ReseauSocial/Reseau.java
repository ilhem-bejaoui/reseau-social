package ReseauSocial;
import java.util.ArrayList;

public class Reseau {

	public	static ArrayList <Page> lespages = new ArrayList();     // tous les pages du reseau
	public	static ArrayList <Groupe> lesgroupes = new ArrayList(); // tous les groupes du reseau
			
	
  
	public void suggerer_amis_amis_communs(Graphe G,Membre M,int N) {          // suggerer des amis en fonctions de nombres des amis en commun 
	      int nb=0;                                                           // si >0 on ajoute cette personne a la liste des suggestions
	      
	      
	      
	      G.remplir_matrice_graphe(N);       // remplissage de la matrice d'adjacence
	      
	      
	      for(int i=0;i<N;i++) {
	    	  
	    	  if (M.id!= i) {            // i represente l'indice du membre tab1[i]
	    		  
	    		  if (G.adj[i][M.id]==0) {
	    			  
	    			  for(int k=0;k<N;k++) {
	    				  
	    				 if ((G.adj[k][i]==1) && (G.adj[k][M.id]==1)){
	    					 nb=nb+1;}
	    			
	    		  }
	    		  
	    		  
	    	  }
	    	  }
	    	  
	  
	         if (nb>0) {
		         M.Suggestion.add(G.tab1[i]);
		  
	         }
	  
}
	}

public void suggerer_amisPagescommunes(Graphe G,Membre m,int N) // suggerer des amis par le critere pages communes
{
	  int nb=0;
	  
	  G.remplir_matrice_graphe(N);       // remplissage de la matrice d'adjacence
      
      
      for(int i=0;i<N;i++) {
    	  
    	  if (m.id!= i) {            // i represente l'indice du membre tab1[i]
    		  
    		  for (int k=0;k<m.mesPages_aimées.size();k++) {
    			  
    			 if( G.tab1[i].mesPages_aimées.contains(m.mesPages_aimées.get(k))){
    				 
    				 nb=nb+1;
    				 
    				 
    			  
    		  }
    			  
    		  }
    		  
    	  }
    	  
    	  if(nb>0) {
    		  
    		  m.Suggestion.add(G.tab1[i]);
    		  
    	  }
    	  
    	  
    	  
      }
      
      
}


//recherche de suggestion d'amis par la methode du plus cours chemin

public void suggerer_amis_plusCourtChemin(Graphe G,Membre m ,int N) {
	

	for(int j=0;j<N;j++) {       // on considere que chaque element de tableau des sommets
		                          // est un entier qui est (l'id de cet sommet)
		
		if(G.adj[m.id][j]==1) {
			
			for(int k=0;k<N;k++) {
				
				if((G.adj[k][j]==1) && (G.adj[k][m.id]==0)){
					
					m.Suggestion.add(G.tab1[k]);  //  on ajoute le membre d'indice k a la liste
					                              // des suggestion du membre m
				}
			}
		}
		
	

	}

}  		  
    		  
    		  
    		  
    	  
    	  
       
	  
	  
		  
	  
	  





}



	

