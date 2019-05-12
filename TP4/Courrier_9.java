package sacPostal;

public abstract class Courrier_9{
	protected boolean Vitesse;
	protected double Timbre;
	protected int Volume;
	
	public Courrier_9(){
		Vitesse = false;
		Timbre = 0.5;
		Volume = 1;
	}
	
	abstract void Afficher();
	abstract void Affranchir();
}
