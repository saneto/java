import agenda.*;
import java.*;

public class TestAnnuaire_2{
	public static void main(String args[]){
		Abonne_2 ab1 = new Abonne_2("Coincoin", "Alain", 4, "0");	
		Abonne_2 ab2 = new Abonne_2("Loiseau", "Pewpew", 3, "01");	
		Abonne_2 ab3 = new Abonne_2("Leloup", "Graou", 2, "012");	
		Abonne_2 ab4 = new Abonne_2("GRUIK", "Gruik", 1, "0123");	
		
		Annuaire_2 an1 = new Annuaire_2();
		an1.Afficher();
		an1.Ajouter(ab1);
		an1.Ajouter(ab2);
		an1.Ajouter(ab3);
		an1.Ajouter(ab4);
		an1.Afficher();
		
		System.out.println("Recherche de Coincoin : ");
		if(an1.RechercheNom("Coincoin")) System.out.println("\tRecherche réussie !");
		else System.out.println("\tRecherche échouée.");
		
		System.out.println("Suppression de Leloup.");
		an1.Virer("Leloup");		
		
		System.out.println("Recherche de Leloup : ");
		if(an1.RechercheNom("Leloup")) System.out.println("\tRecherche réussie !");
		else System.out.println("\tRecherche échouée.");
		
	}
}
