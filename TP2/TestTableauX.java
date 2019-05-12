import java.io.*;

public class TestTableauX{
	public static void main(String[] args){
		int a;
		BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		
		TableauX tab = new TableauX(10);
		
		/*
		//Tableau d'int
		System.out.println("\n\nTEST : Saisie du tableau");
		tab.saisieTab();
		System.out.println("\n\nTEST : Saisie aléatoire du tableau");
		tab.remplirTableau();
		System.out.println("\n\nTEST : Affichage du tableau");
		tab.afficheTab();
		System.out.println("\n\nTEST : Rangement du tableau");
		tab.triABulle();
		System.out.println("\n\nTEST : Affichage du tableau");
		tab.afficheTab();
		System.out.println("\n\nTEST : Plus grand");
		System.out.print(tab.getPlusGrand());
		System.out.println("\n\nTEST : Plus petit");
		System.out.print(tab.getPlusPetit());
		System.out.println("\n\nTEST : Recherche");
		System.out.print("Entrez la valeur à rechercher : ");
		try{a = Integer.parseInt(clavier.readLine());}catch(IOException E){a=0;}
		if(tab.rechercheNombre(a)) System.out.println("La valeur est dans le tableau");
		else System.out.print("La valeur n'est pas dans le tableau");
		*/
		
		//Tableau de String
		System.out.println("\n\nTEST : Saisie du tableau");
		tab.saisieTabc();
		System.out.println("\n\nTEST : Affichage du tableau");
		tab.afficheTabc();
		System.out.println("\n\nTEST : Rangement croissant du tableau");
		tab.croissant();
		System.out.println("\n\nTEST : Affichage du tableau");
		tab.afficheTabc();
		System.out.println("\n\nTEST : Rangement décroissant du tableau");
		tab.decroissant();
		System.out.println("\n\nTEST : Affichage du tableau");
		tab.afficheTabc();
		
	}
}
