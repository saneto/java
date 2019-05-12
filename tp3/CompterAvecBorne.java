import Compteurs.CompteurBorne;

public class CompterAvecBorne{
	public static void main (String argv[]){
		CompteurBorne c1 = new CompteurBorne();
		CompteurBorne c2 = new CompteurBorne(10, 20);
		CompteurBorne c3 = new CompteurBorne(100, 150, 200);
		
		c1.affiche();
		c2.affiche();
		c3.affiche();
		
		System.out.println("Incrémentations : c1+=1, c2+=2, c3+=3");
		c1.incremente();
		c2.incremente(2);
		c3.incremente(3);
		c1.affiche();
		c2.affiche();
		c3.affiche();
		
		System.out.println("Decrémentations : c1-=1, c2-=2, c3-=3");
		c1.decremente();
		c2.decremente(2);
		c3.decremente(3);
		c1.affiche();
		c2.affiche();
		c3.affiche();
		
		System.out.println("Decrémentations : c1-=200, c2-=200, c3-=200");
		c1.decremente(200);
		c2.decremente(200);
		c3.decremente(200);
		c1.affiche();
		c2.affiche();
		c3.affiche();
		
		System.out.println("Incrémentations : c1+=250, c2+=250, c3+=250");
		c1.incremente(250);
		c2.incremente(250);
		c3.incremente(250);
		c1.affiche();
		c2.affiche();
		c3.affiche();
	}
}
