
public class HabitationIndividuelle extends habitation
{
	private int NombrePieces;
	private boolean piscine;
	public HabitationIndividuelle(String p, String a, double s, String T,int NbP,boolean pis)
	{
		super(p, a, s, T);
		NombrePieces=NbP;
		piscine=pis;
	
	}

	public double calculImport() 
	{
		if(piscine==true)
		{
			this.ImportFoncier=100*NombrePieces+this.getSurface()*5+500;
		}else{
			this.ImportFoncier=100*NombrePieces+this.getSurface()*5;
		}
		
		return this.ImportFoncier;
	}
	public void affiche()
	{
		if(piscine==true)
		{
			System.out.println(this.getPropieter()+" "+this.getAdresse()+"  "+this.getSurface()+"  "+NombrePieces+" avec piscine "+"  impot "+this.ImportFoncier+"euros");
		}else{
			System.out.println(this.getPropieter()+" "+this.getAdresse()+"  "+this.getSurface()+"  "+NombrePieces+" sans piscine"+"impot"+this.ImportFoncier+"euros");
		}
	}
	
}
