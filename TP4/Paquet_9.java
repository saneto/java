package sacPostal;

public class Paquet_9 extends Courrier_9{
	public Paquet_9(int vol){
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
