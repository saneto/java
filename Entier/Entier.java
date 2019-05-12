import java.io.*;

public class Entier
{
	int valeur;
	BufferedReader clavier;
	public Entier(int val)
	{
		valeur = val;
		clavier=new BufferedReader(new InputStreamReader(System.in));
	}
	public int factorielle()
	{
		int i;
		int tmp = valeur;
		for(i=valeur-1;i>1;i--)
		{
			tmp = tmp * i;
		}
		return tmp;
	}
	public int somme()
	{
		int i;
		int tmp = valeur;
		for(i=valeur-1;i>0;i--)
		{
			tmp = tmp + i;
		}
		return tmp;
	}
	public void afficheValeur()
	{
		System.out.println("Valeur : "+valeur);
	}
	public int puissance(int y)
	{
		int i;
		int tmp = valeur;
		for(i=0;i<y;i++)
		{
			tmp = tmp * tmp;
		}
		return tmp;
	}
}
