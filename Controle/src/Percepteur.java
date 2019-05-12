
public class Percepteur
{
	private ImpotFoncierDuSecteur Lesecteur;
	private String Login;
	private String MDP;
	public Percepteur(String L,String M)
	{
		Login=L;
		MDP=M;
	}
	public String getLogin()
	{
		return Login;
	}
	public void setSecteur(ImpotFoncierDuSecteur sect)
	{
		Lesecteur=sect;
	}
	public boolean ajouterHabitation(String nom,String Adresse,int surface,int NbP,String type,boolean piscine)
	{
		habitation h;
		h=(habitation)(new HabitationIndividuelle(nom,Adresse,surface,type,NbP,piscine));
		if(Lesecteur.ajoutHabitation(h)==true)
		{
			return true;
		}
		else{
			return false;
		}
		
	}
	public boolean ajouterHabitation(String nom,String Adresse,int surface,String type,int NbE)
	{
		habitation h;
		h=(habitation)(new HabitationProfessionnelle(nom,Adresse,surface,type,NbE));
		if(Lesecteur.ajoutHabitation(h)==true)
		{
			return true;
		}
		else{
			return false;
		}
		
	}
	public boolean estpercepteur(Percepteur p)
	{
		if(Login.compareTo(p.Login)==0 && MDP.compareTo(p.MDP)==0)
		{
			return true;
		}
		return false;
	}
	public void calculerLesImpotsduSecteur()
	{
		Lesecteur.calculerImpot();
	}
}
