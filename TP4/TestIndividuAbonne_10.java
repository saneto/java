import agenda.*;

public class TestIndividuAbonne_10{
	public static void main(String args[]){
		Individu_10 i1 = new Individu_10 ("Coincoin", "Alain", 15);
		Abonne_10 a1 = new Abonne_10("Loiseau", "Pewpew", 2, "0123456789");
		i1.affiche();
		a1.affiche();
		
		System.out.println("toString individu : "+ i1.toString());
		System.out.println("toString abonne   : "+ a1.toString());
		
	}
}
