package sacPostal;

public class Paquet extends Courrier{
	public Paquet(int vol){
		Volume = vol;
		Affranchir();
	}
	
	public void Afficher(){
		System.out.println("Volume : " +Volume);
		System.out.println("Timbre : " +Timbre);
	}
	
	public void Affranchir(){
		Timbre = Volume;
	}
}
