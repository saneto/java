package agenda2;

class Individu{
	private String Nom;
	private String Prenom;
	private int Age;
	
	public Individu(){
		this.Nom = "";
		this.Prenom = "";
		this.Age = 0;
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

public class Abonne2 extends Individu{
	private String Telephone;
	
	public Abonne2(){
		setNom("");
		setPrenom("");
		setAge(0);
		this.Telephone = "";
	}
	
	public Abonne2(String Nom, String Prenom, int Age, String Telephone){
		super(Nom, Prenom, Age);
		this.Telephone = Telephone;
	}
	
	public void affiche(){
		System.out.println("Prenom : "+getPrenom());
		System.out.println("Nom : "+getNom());
		System.out.println("Age : "+getAge());
		System.out.println("Telephone : "+Telephone);
	}
	
	public void setTelephone(String NouveauTelephone){	Telephone = NouveauTelephone;	}
	public String getTelephone(){	return Telephone;	}
	
}
