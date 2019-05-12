package agenda;
import java.util.*;

public class Annuaire_2{
	Vector <Abonne_2> Vannu;
	Iterator<Abonne_2> it;
	
	public Annuaire_2(){
		Vannu = new Vector <Abonne_2>();
	}
	
	public void Ajouter(Abonne_2 abo1)
	{
		Vannu.addElement(abo1);
	}
	
	public void Afficher()
	{
		//for(int i=0; i<Vannu.size(); i++)	
		//	System.out.println("Element "+i+" : "+Vannu.get(i));
		it = Vannu.iterator() ;
		while ( it.hasNext() ) {
			System.out.println(it.next());
		}
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