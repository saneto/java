package agenda;
import java.io.*;

public class Individu_2{
	private int Age;
	protected String Nom;
	protected String Prenom;
	private BufferedReader clavier;
	
	public Individu_2(){
		clavier = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Entrez le nom : ");
		try{
		this.Nom = clavier.readLine();
		}catch(IOException E){}
		
		System.out.println("Entrez le prénom : ");
		try{
		this.Prenom = clavier.readLine();
		}catch(IOException E){}
		
		System.out.println("Entrez l'age : ");
		try{
			this.Age = Integer.parseInt(clavier.readLine());
		}catch(IOException E){}
	}
	
	public Individu_2(String Nom, String Prenom, int Age){
		this.Nom = Nom;
		this.Prenom = Prenom;
		this.Age = Age;
	}
	
	public void affiche(){
		System.out.println("Prénom : "+Prenom);
		System.out.println("Nom : "+Nom);
		System.out.println("Age : "+Age);
	}
	
	public void setPrenom(String Nouveauprenom){	Prenom = Nouveauprenom;	}
	public void setNom(String Nouveaunom){			Nom = Nouveaunom;		}
	public void setAge(int Nouvelage){				Age = Nouvelage;		}
	
	public String getPrenom(){	return Prenom;	}
	public String getNom(){		return Nom;		}
	public int getAge(){		return Age;		}
	
	public String toString(){
		return "Prénom : "+Prenom+"\tNom : "+Nom+"\tAge : "+Age;
	}
	
}
