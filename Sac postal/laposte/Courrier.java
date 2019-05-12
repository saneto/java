package laposte;

public abstract class Courrier {
	protected String Timbre ;
	protected int Volume ;
	protected boolean Vitesse ;
	public Courrier() {
		Timbre = "0.50" ;
		Volume = 1 ;
		Vitesse = false ;
	}
	public  abstract void affranchir();
	public  abstract void afficher() ;
}
