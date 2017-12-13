package ile_interdite.Controler;

import ile_interdite.Plateau.Tuile;
import ile_interdite.Plateau.Grille;
import ile_interdite.Vue.VueAventurier;
import ile_interdite.Aventurier.*;
import java.util.*;

public class Controleur {

	Grille grille;
	VueAventurier vueAventurier;
	ArrayList<Aventurier> joueurs;

	public void seDeplacer() {
		// TODO - implement Controleur.seDeplacer
		throw new UnsupportedOperationException();
	}

	public void JoueurSuivant() {
		// TODO - implement Controleur.JoueurSuivant
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param collecTuile
	 * @param pos
	 */
	public void ajouterTuile(Tuile collecTuile, Tuile pos) {
		// TODO - implement Controleur.ajouterTuile
		throw new UnsupportedOperationException();
	}

	public void assecherTuile() {
		// TODO - implement Controleur.assecherTuile
		throw new UnsupportedOperationException();
	}
	
	public void inscrireJoueur()
	{
	    Scanner sc = new Scanner(System.in);
	    int nbrJoueur = 0;
	    String choix, nomJoueur;
	    ArrayList<Role> rolesDispo = new ArrayList<>();
	    for (Role value : Role.values())
	    {
		rolesDispo.add(value);
	    }
	    
	    while(nbrJoueur < 2 || nbrJoueur > 4)
	    {
		System.out.println("Combien de joueurs ? {2;3;4}");
		nbrJoueur = sc.nextInt();
	    }
	    
	    for(int i = 0 ; i < nbrJoueur ; i++)
	    {
		System.out.println("JOUEUR " + i);
		System.out.println("Votre nom:");
		nomJoueur = sc.nextLine();
		
		
		System.out.println("Les roles disponibles sont :");
		for(Role role : rolesDispo) System.out.println(role);
		
		do
		{
		    System.out.println("Choix := ");
		    choix = sc.nextLine();
		    
		} while(Role.getFromName(choix) == null || !rolesDispo.contains(Role.getFromName(choix)));
		
		
		switch(Role.getFromName(choix))
		{
		    case EXPLORATEUR:
			this.joueurs.add(new Explorateur(nomJoueur);
                        rolesDispo.remove(i)
			break;
			
		    case INGENIEUR:
			this.joueurs.add(new Ingenieur(nomJoueur));
			break;
			
		    case MESSAGER:
			this.joueurs.add(new Messager(nomJoueur));
			break;
			
		    case NAVIGATEUR:
			this.joueurs.add(new Navigateur(nomJoueur));
			break;
			
		    case PILOTE:
			this.joueurs.add(new Pilote(nomJoueur));
			break;
			
		    case PLONGEUR:
			this.joueurs.add(new Plongeur(nomJoueur));
			break;
			
		    default:break;
		}
		
		
		
		
	    }
	    
	    
	}

}