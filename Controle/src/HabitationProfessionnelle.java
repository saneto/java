
public class HabitationProfessionnelle extends habitation
{
	private double NombreEmployes;
	public HabitationProfessionnelle(String p,String a,double s,String T,double NbE)
	{
		super(p,a,s,T);
		NombreEmployes=NbE;
	}
	public double calculImport() 
	{
		this.ImportFoncier=NombreEmployes*300+this.getSurface()*10;
		return this.ImportFoncier;
	}
	public void affiche()
	{
		System.out.println(this.getPropieter()+" "+this.getAdresse()+"  "+this.getSurface()+"  "+NombreEmployes+" employés "+" impot "+this.ImportFoncier+"euros");
		
	}
}
