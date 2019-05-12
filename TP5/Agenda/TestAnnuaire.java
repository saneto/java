import agenda.*;
import java.*;

public class TestAnnuaire{
	public static void main(String args[]){
		Abonne ab1 = new Abonne("Coincoin", "Alain", 4, "0");	
		Abonne ab2 = new Abonne("Loiseau", "Pewpew", 3, "01");	
		Abonne ab3 = new Abonne("Leloup", "Graou", 2, "012");	
		Abonne ab4 = new Abonne("GRUIK", "Gruik", 1, "0123");	
		
		Annuaire an1 = new Annuaire();
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
