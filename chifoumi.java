import java.io.*;
public class chifoumi
{
	BufferedReader clavier;
	int Choixjoueur, Choixmachine;
	
	public void getchoixJoueur()
	{
		String saisie;
		System.out.println("Entrez votre choix");
		System.out.println("\t 0 pour le Caillou, 1 pour Papier et 2 pour Ciseaux");
		try 
			{
				saisie=clavier.readLine();
				Choixjoueur=Integer.parseInt(saisie);
			}
			catch(IOException e){}
	}
	public chifoumi()
	{
		BufferedReader clavier=new BufferedReader(new InputStreamReader(System.in));
	}
	public void getchoixMachine()
	{
		int r;
		r=(int)(Math.random() * 3);
		Choixmachine=r;
	}
	public void resultatJeu()
	{
		if(Choixjoueur==0 && Choixmachine==0 || Choixjoueur==1 && Choixmachine==1 || Choixjoueur==2 && Choixmachine==2)
		{System.out.println("Egalité");}
		if(Choixjoueur==0 && Choixmachine==1 || Choixjoueur==1 && Choixmachine==2 || Choixjoueur==2 && Choixmachine==0)
		{System.out.println("Vous avez perdu");}
		if(Choixjoueur==1 && Choixmachine==0 || Choixjoueur==2 && Choixmachine==1 || Choixjoueur==0 && Choixmachine==2)
		{System.out.println("Vous avez gagné");}
	}
	public String conversion(int choix)
	{
		String r="";
		
		if(choix==0)
		{
			r="Caillou";
			
		}
		if(choix==1)
		{	
			r="Papier";

		}
		if(choix==2)
		{	
			r="Ciseaux";
			
		}
		return r;
	}
	public void affichechoix()
	{
		String r;
		r=conversion(Choixjoueur);
		System.out.println("Vous avez choisi" + r);
		r=conversion(Choixmachine);
		System.out.println("La machine a choisi" + r);
	}
	public static void main(String[]args)
	{
		chifoumi C=new chifoumi();
		C.getchoixJoueur();
		C.getchoixMachine();
		C.resultatJeu();
		C.affichechoix();
	}
}