package agenda;
import java.io.*;

public class Individu{
	private int Age;
	protected String Nom;
	protected String Prenom;
	private BufferedReader clavier;
	
	public Individu(){
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
	
	public Individu(String Nom, String Prenom, int Age){
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
	
}
