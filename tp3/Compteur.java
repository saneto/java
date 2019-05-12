package compt;

import java.io.*;

public class Compteur
{
	int Valeur;
	BufferedReader clavier;
	public Compteur()
	{
		clavier=new BufferedReader(new InputStreamReader(System.in));
	}
	public Compteur(int n)
	{
		Valeur=n;
		clavier=new BufferedReader(new InputStreamReader(System.in));
	}
	public void affiche()
	{
		System.out.println("Valeur : "+Valeur);
	}
	public void incremente()
	{
		Valeur++;
	}
	public void incremente(int i)
	{
		Valeur+=i;
	}
	public void decremente()
	{
		Valeur--;
	}
	public void decremente(int d)
	{
		Valeur-=d;
	}
}
	