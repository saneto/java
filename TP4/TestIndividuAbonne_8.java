import agenda.*;

public class TestIndividuAbonne_8{
	public static void main(String args[]){
		Individu_7 i1 = new Individu_7 ("Coincoin", "Alain", 15);
		
		System.out.println("nbAbonnes : "+Abonne_8.getNbAbonnes());
		Abonne_8 a1 = new Abonne_8("Loiseau", "Pewpew", 2, "0123456789");
		System.out.println("nbAbonnes : "+Abonne_8.getNbAbonnes());
		Abonne_8 a2 = new Abonne_8("Leloup", "Graou", 3, "0223456789");
		System.out.println("nbAbonnes : "+Abonne_8.getNbAbonnes());
		Abonne_8 a3 = new Abonne_8("Lours", "Roar", 4, "0323456789");
		System.out.println("nbAbonnes : "+Abonne_8.getNbAbonnes());
		i1.affiche();
		a1.affiche();
		a2.affiche();
		a3.affiche();
		
		System.out.println("toString individu : "+ i1.toString());
		System.out.println("toString abonne   : "+ a1.toString());
		
	}
}
