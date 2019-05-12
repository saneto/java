import agenda.*;

public class Test02{
	public static void main(String args[]){
		Individu i1 = new Individu ("Coincoin", "Alain", 15);
		Individu i2 = new Individu ();
		Abonne a1 = new Abonne("Loiseau", "Pewpew", 2, "0123456789");
		Abonne a2 = new Abonne();
		i1.affiche();
		a1.affiche();
		i2.affiche();
		a2.affiche();
		
	}
}
