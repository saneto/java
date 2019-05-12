package laposte;

public class Paquet extends Courrier{
	public Paquet(int volume){
		Volume = volume ;
	}
	
	public void affranchir() {
		Timbre = String.valueOf(Volume);
	}
	public void afficher() {
		System.out.println("Paquet timbré à "+Timbre);
	}
}
