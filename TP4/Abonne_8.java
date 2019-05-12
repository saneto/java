package agenda;
import java.io.*;

public class Abonne_8 extends Individu_7{
	private String Telephone;
	private BufferedReader clavier;
	private static int nbAbonnes=0;
	
	public Abonne_8(){
		super();
		clavier = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entrez le numero de telephone : ");
		try{
			this.Telephone = clavier.readLine();
		}catch(IOException E){}
		nbAbonnes++;
	}
	
	public Abonne_8(String Nom, String Prenom, int Age, String Telephone){
		super(Nom, Prenom, Age);
		this.Telephone = Telephone;
		nbAbonnes++;
	}
	
	public void affiche(){
		System.out.println("Prenom : "+getPrenom());
		System.out.println("Nom : "+getNom());
		System.out.println("Age : "+getAge());
		System.out.println("Telephone : "+Telephone);
	}
	
	public void setTelephone(String NouveauTelephone){	Telephone = NouveauTelephone;	}
	public String getTelephone(){	return Telephone;	}
	
	public String toString(){
		return "Prénom : "+Prenom+"\tNom : "+Nom+"\tAge : "+getAge()+"\tTelephone : "+Telephone;
	}
	
	public static int getNbAbonnes(){	return nbAbonnes;	}
}
