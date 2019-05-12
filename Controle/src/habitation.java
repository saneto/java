
public abstract class habitation 
{
	private String Proprietaire;
	private String Adresse;
	private double Surface;
	private String Type;
	protected double ImportFoncier;
	
	public habitation(String p,String a,double s,String T)
	{
		Proprietaire=p;
		Adresse=a;
		Surface=s;
		Type=T;
	}
	abstract double calculImport();
	public void affiche()
	{
		System.out.println(Proprietaire+" "+Adresse+"  "+Surface+"  "+Type);
	}
	public String getPropieter()
	{
		return Proprietaire;
	}
	public String getAdresse()
	{
		return Adresse;
	}
	public double getSurface()
	{
		return Surface;
	}
}
