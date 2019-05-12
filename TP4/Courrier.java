package sacPostal;

public class Courrier{
	protected boolean Vitesse;
	protected double Timbre;
	protected int Volume;
	
	public Courrier(){
		Vitesse = false;
		Timbre = 0.5;
		Volume = 1;
	}
	
	public void Afficher(){
		System.out.println("Vitesse : " +Vitesse);
		System.out.println("Timbre : " +Timbre);
		System.out.println("Volume : " +Volume);
	}
}
