import java.util.*;


public class LesPercepteurs 
{
	private HashMap<String,Percepteur>listpercepteurs;
	private HashMap<String,ImpotFoncierDuSecteur>lessecteurs;
	public LesPercepteurs()
	{
		listpercepteurs=new HashMap<String,Percepteur>();
		listpercepteurs.put("picsou",new Percepteur("picsou","radin"));
		listpercepteurs.put("donald",new Percepteur("donald","coincoin"));
		listpercepteurs.put("pluto",new Percepteur("pluto","cempltemesos"));
		listpercepteurs.put("mickey",new Percepteur("mickey","lemalin"));
		listpercepteurs.put("daisy",new Percepteur("daisy","bijoux"));
		lessecteurs=new HashMap<String,ImpotFoncierDuSecteur>();
		lessecteurs.put("picsou",new ImpotFoncierDuSecteur("secteurnord "));
		lessecteurs.put("donald",new ImpotFoncierDuSecteur("secteursud"));
		lessecteurs.put("pluto",new ImpotFoncierDuSecteur("secteurest"));
		lessecteurs.put("mickey",new ImpotFoncierDuSecteur("secteurouest"));
		lessecteurs.put("daisy",new ImpotFoncierDuSecteur("secteurcentre"));
		
	}
	public boolean isPercepteur(Percepteur perc)
	{
		Percepteur t=listpercepteurs.get(perc.getLogin());
		if(t!=null)
		{
			if(t.estpercepteur(perc)==true)
			{
				perc.setSecteur(lessecteurs.get(t.getLogin()));
				return true;
			}
		}
		
		return false;
	}
}
