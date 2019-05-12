package classVect;

public class testVect {

	public static void main(String[] args) throws InterruptedException {
		Vect vecteur = new Vect();
		ThreadTrieuse tht = new ThreadTrieuse(vecteur);	tht.start();
		
		vecteur.add("a");
		vecteur.add("f");
		vecteur.add("s");
		vecteur.add("u");
		vecteur.add("r");
		vecteur.add("w");
		vecteur.add("q");
		vecteur.add("o");

        Thread.sleep(6000);
		vecteur.add("b");
		vecteur.add("x");
		
    //    Thread.sleep(6000);
		vecteur.add("c");
		vecteur.add("i");
		
      //  Thread.sleep(6000);
		vecteur.add("y");
		vecteur.add("e");
        
		tht.end();
	}
}