import agenda.*;
import java.*;

public class TestAnnuaire_3{
	public static void main(String args[]){
		Abonne_3 ab1 = new Abonne_3("Coincoin", "Alain", 4, "0");	
		Abonne_3 ab2 = new Abonne_3("Loiseau", "Pewpew", 3, "0");	
		
		/*Abonne_3 ab3 = new Abonne_3("Leloup", "Graou", 2, "012");	
		Abonne_3 ab4 = new Abonne_3("GRUIK", "Gruik", 1, "0123");	
		Abonne_3 ab5 = new Abonne_3("GRUIK", "132", 10, "01234");	*/
		
		Annuaire_3 an1 = new Annuaire_3();
		an1.Afficher();
		an1.Ajouter(ab1);
		an1.Ajouter(ab2);
		/*an1.Ajouter(ab3);
		an1.Ajouter(ab4);
		an1.Ajouter(ab5);*/
		an1.Afficher();
		
		System.out.println("Recherche de GRUIK : ");
		if(an1.RechercheNom("GRUIK")) System.out.println("\tRecherche réussie !");
		else System.out.println("\tRecherche échouée.");
		
		System.out.println("Suppression de Leloup.");
		//an1.Virer("Leloup");		
		
		System.out.println("Recherche de Leloup : ");
		if(an1.RechercheNom("Leloup")) System.out.println("\tRecherche réussie !");
		else System.out.println("\tRecherche échouée.");
		
	}
}
