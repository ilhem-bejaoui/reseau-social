package ReseauSocial;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

	   
		Reseau R =new Reseau();
		Membre M=new Membre("Garrouch","Rihem",1);
        Membre N=new Membre("Bjaoui","ilhem",2);
		Membre X=new Membre("mohamed","ahmed",3);
		Membre Y=new Membre("aa","cc",4);
		Membre Z=new Membre("mohamed","rr",5);
		Membre E=new Membre("mm","rr",6);
		Membre F=new Membre("ss","rr",7);
		Membre H=new Membre("dd","f",5);
		Membre S=new Membre("ll","m",5);
		Membre T=new Membre("riheeem","r",5);

	    Graphe G=new Graphe(10);
	    
	  Membre tab1[]=new Membre[10];
		
		
		Date d1=new Date(2020,12,22);
		Date d2 =new Date(2000,11,22);
		Date d3=new Date(2011,11,11);
		Date d4=new Date(2020,04,11);
	
	     
		Page P=new Page("page1",3,d1,"y",X);
		M.creer_Page("text",55,d2,"x");
		N.creer_Groupe("text1",67,d3,"y");
		Groupe g=new Groupe("groupe",66,d4,"Z",M);
		
		
		M.Envoyer_demande(N);
		M.Envoyer_demande(X);
		Y.Envoyer_demande(N);
		
		N.accepter_invitation(Y);
		N.accepter_invitation(M);
		X.annuler_invitation(M);
		
		
		X.aimer(P);
		N.aimer(P);
		X.rejoindreGroupe(g);
		N.rejoindreGroupe(g);
		
       g.showadmines_groupe();
       g.showmembres();
       P.showadmines();
       P.showlikers();

       
       
       Date D=new Date(2020,12,22);
	   M.publier_message(D, "joyeux anniversaire", N);
	   
	   
	 
	  R.suggerer_amis_amis_communs(G, M, 10);
	   
	  R.suggerer_amisPagescommunes(G, M, 10); 
	  
	  R.suggerer_amis_plusCourtChemin(G, M, 10);
	  
	  M.showSuggestion();
	  N.showSuggestion();
	  
	   
	 	
	  G.recherche_personne_backtraking(3,"Garrouch","rihem",3,10); 
      G.recherche_personne_backtraking(3,"bjaoui","ilhem",4,10); 
    	





	}

}
