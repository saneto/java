import agenda.*;

public class TestIndividuAbonne_7{
	public static void main(String args[]){
		Individu_7 i1 = new Individu_7 ("Coincoin", "Alain", 15);
		Abonne_7 a1 = new Abonne_7("Loiseau", "Pewpew", 2, "0123456789");
		i1.affiche();
		a1.affiche();
		
		System.out.println("toString individu : "+ i1.toString());
		System.out.println("toString abonne   : "+ a1.toString());
		
	}
}