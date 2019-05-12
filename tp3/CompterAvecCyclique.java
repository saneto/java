import Compteurs.*;

public class CompterAvecCyclique{
	public static void main (String argv[]){ 
		CompteurCyclique c1 = new CompteurCyclique();
		int pas = 53;
		c1.affiche();
		
		System.out.println("Incrémentation : c1+="+pas);
		c1.incremente(pas);
		c1.affiche();
		
		System.out.println("2 décrémentations : c1-="+pas);
		c1.decremente(pas);
		c1.decremente(pas);
		c1.affiche();
		
	}
}
