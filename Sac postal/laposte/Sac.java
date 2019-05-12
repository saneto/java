package laposte;

public class Sac {
	private Courrier []Mail ;
	private int Places ;
	private int Occupees ;
	public Sac() {
		Mail = new Courrier[100] ;
		Places = 100 ;
		Occupees = 0 ;
	}
	public boolean testSacPlein(Courrier c){
		if ((100 - Occupees) >= c.Volume )
			return true ;
		else return false ;
	}
	public void remplirSac(Courrier c) {
		if (testSacPlein(c)==true) {
			Mail[Occupees] = c ;
			Occupees = Occupees + c.Volume ;
		}
		else System.out.println("Courrier trop volumineux");
	}
	public void affranchir() {
		int i = 0 ;
		while (i < Occupees){
			Mail[i].affranchir();
			Mail[i].afficher();
			i = i + Mail[i].Volume ;
		}
	}
}
