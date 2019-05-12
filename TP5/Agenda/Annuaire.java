package agenda;
import java.util.*;

public class Annuaire{
	Vector <Abonne> Vannu;
	
	public Annuaire(){
		Vannu = new Vector <Abonne>();
	}
	
	public void Ajouter(Abonne abo1)
	{
		Vannu.addElement(abo1);
	}
	
	public void Afficher()
	{
		for(int i=0; i<Vannu.size(); i++)	
			System.out.println("Element "+i+" : "+Vannu.get(i));
	}
	
	public void Virer(String AVirer)
	{
		for(int i=0; i<Vannu.size(); i++)			
			if(Vannu.get(i).getNom().equals(AVirer))
				Vannu.remove(i);
	}
		
	public boolean RechercheNom(String CeNom)
	{
		for(int i=0; i<Vannu.size(); i++)			
			if(Vannu.get(i).getNom().equals(CeNom))
				return true;
		return false;
	}
	
	public boolean RechercheNumero(String CeNumero)
	{
		for(int i=0; i<Vannu.size(); i++)			
			if(Vannu.get(i).getTelephone().equals(CeNumero))
				return true;
		return false;
	}
}
