package agenda;
import java.io.*;

public class Abonne_10 extends Individu_10 implements affichable_10{
	private String Telephone;
	private BufferedReader clavier;
	
	public Abonne_10(){
		super();
		clavier = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entrez le numero de telephone : ");
		try{
			this.Telephone = clavier.readLine();
		}catch(IOException E){}
	}
	
	public Abonne_10(String Nom, String Prenom, int Age, String Telephone){
		super(Nom, Prenom, Age);
		this.Telephone = Telephone;
	}
	
	public void affiche(){
		System.out.println("Prenom : "+getPrenom());
		System.out.println("Nom : "+getNom());
		System.out.println("Age : "+getAge());
		System.out.println("Telephone : "+getTelephone());
	}
	
	public void affichetout(){
		System.out.println("Prenom : "+getPrenom());
		System.out.println("Nom : "+getNom());
		System.out.println("Age : "+getAge());
		System.out.println("Telephone : "+getTelephone());
	}
	
	public void setTelephone(String NouveauTelephone){	Telephone = NouveauTelephone;	}
	public String getTelephone(){	return Telephone;	}
	
	public String toString(){
		return "Prénom : "+Prenom+"\tNom : "+Nom+"\tAge : "+getAge()+"\tTelephone : "+Telephone;
	}
	
}
