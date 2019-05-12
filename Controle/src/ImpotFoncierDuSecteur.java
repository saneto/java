import java.util.*;


public class ImpotFoncierDuSecteur
{
	private String nombreSecteur ;
	private Vector<habitation> cessecteur;
	public ImpotFoncierDuSecteur(String lenomdusecteur)
	{
		cessecteur=new Vector<habitation>();
		nombreSecteur=lenomdusecteur;
	}
	public boolean ajoutHabitation(habitation hab)
	{
		if(estEnregistre(hab)==true)
		{
			System.out.println("habitation  existe deja");
			return false;
		}
		else{System.out.println("habitation ajouter  ");
			cessecteur.add(hab);
			return true;}
		
	}
	public boolean supprimerHabitation(habitation hab)
	{
		if(estEnregistre(hab)==true)
		{
			cessecteur.remove(hab);
			System.out.println("habitation supprimé");
			return true;
		}
		else{System.out.println("habitation  inexistant");
			return false;}
	}
	public boolean estEnregistre(habitation hab)
	{
		int i;
		for(i=0;i<cessecteur.size();i++)
		{
			if(cessecteur.elementAt(i).getPropieter().compareTo(hab.getPropieter())==0 && cessecteur.elementAt(i).getAdresse().compareTo(hab.getAdresse())==0)
			{
				return true;
			}
		}
		return false;
	}
	public void calculerImpot()
	{
		int i,calc=0;
		for(i=0;i<cessecteur.size();i++)
		{
			cessecteur.elementAt(i).calculImport();
			calc+=cessecteur.elementAt(i).ImportFoncier;
		}
		System.out.println("les impots sur le secteur  "+nombreSecteur+" est de "+calc+" euros");
	}
	public String lireProprietaire(String Adr)
	{
		int i;
		habitation h;
		for(i=0;i<cessecteur.size();i++)
		{
			h=cessecteur.elementAt(i);
			if(h.getAdresse().compareTo(Adr)==0)
			{
				return h.getPropieter();
			}
		}
		return null;
	}
	public Vector<String>lireAdresses(String prop)
	{
		Vector<String>liste=new Vector<String>();
		int i;
		habitation h;
		for(i=0;i<cessecteur.size();i++)
		{
			h=cessecteur.elementAt(i);
			if(h.getPropieter().compareTo(prop)==0)
			{
				liste.add(h.getAdresse());
			}
		}
			return liste;
		
	}
	
}
