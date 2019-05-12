package agenda;
import java.util.*;

public class Annuaire_3{
	HashMap<String, Abonne_3> NomAbonne;
	HashMap<String, Abonne_3> NumAbonne;
	
	public Annuaire_3(){
		NomAbonne = new HashMap<String, Abonne_3>();
		NumAbonne = new HashMap<String, Abonne_3>();
	}
	
	public void Ajouter(Abonne_3 abo1)
	{
		NomAbonne.put(abo1.getNom(), abo1);
		NumAbonne.put(abo1.getTelephone(), abo1);
	}
	
	public void Afficher()
	{
		Collection<Abonne_3> co = NumAbonne.values();
		Iterator<Abonne_3> it = co.iterator();
		
		System.out.println("Avec NumAbonne : ");
		while(it.hasNext())
			System.out.println(it.next());
			
		Collection<Abonne_3> co2 = NomAbonne.values();
		Iterator<Abonne_3> it2 = co2.iterator();
		
		System.out.println("Avec NomAbonne : ");
		while(it2.hasNext())
			System.out.println(it2.next());
		
	}
	
	/*public void Virer(String AVirer)
	{
		for(int i=0; i<Vannu.size(); i++)			
			if(Vannu.get(i).getNom().equals(AVirer))
				Vannu.remove(i);
	}*/
		
	public boolean RechercheNom(String CeNom)
	{
		Abonne_3 tmp = NomAbonne.get(CeNom);
		if(tmp != null) return true;
		else return false;
	}
	
	public boolean RechercheNumero(String CeNumero)
	{
		Abonne_3 tmp = NumAbonne.get(CeNumero);
		if(tmp != null) return true;
		else return false;
	}
}
