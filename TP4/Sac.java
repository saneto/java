package sacPostal;

public class Sac{
	private Courrier Mail[];
	private int Places;
	private int Occupees;
	
	public Sac(){
		Places = 100;
		Occupees = 0;
		Mail = new Courrier[100];
	}
	
	public boolean remplirSac(Courrier c){
		if((Occupees+c.Volume)<Places){
			Mail[Occupees] = c;
			Occupees += c.Volume;
			return true;
		}else	return false;
	}
	
	public double Affranchir(){
		double PrixTotal=0;
		for(int i=0; i<100; i++)	
			if(Mail[i] != null)	
				PrixTotal += Mail[i].Timbre;
		return PrixTotal;
	}
	
	public boolean testSacPlein(){
		if(Occupees == 100)	return true;
		return false;
	}
	
	public double AfficherPrixContenu(){
		double PrixTotal=0;
		int nblettres=0, nbcolis=0;
		for(int i=0; i<100; i++)	
			if(Mail[i] != null)	
				if(Mail[i].Timbre%1 != 0) System.out.println("La lettre "+ ++nblettres +" coûte : " + Mail[i].Timbre);
				else System.out.println("Le collis "+ ++nbcolis +" coûte : " + Mail[i].Timbre);
		return PrixTotal;
	}
}



