package sacPostal;

public class Lettre extends Courrier{
	public Lettre(boolean vit){
		Vitesse = vit;
		Affranchir();
	}
	
	public void Afficher(){
		System.out.println("Vitesse : " +Vitesse);
		System.out.println("Timbre : " +Timbre);
	}
	
	public void Affranchir(){
		Timbre = 0.5;
		if(Vitesse) Timbre += 0.3;
	}
}
