import java.io.*;
import compt.*;

public class Test1
{
	public static void main(String[] args)
	{
		Compteur e;
		String s="";
		BufferedReader c;
		c=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Commencez par saisir un entier : ");
		try
		{
			s=c.readLine();
		}catch(IOException p){}
		e=new Compteur(Integer.parseInt(s));
		e.affiche();
		e.incremente();
		e.affiche();
		System.out.println("incrémente de 50");
		s="50";
		e.incremente(Integer.parseInt(s));
		e.affiche();
		e.decremente();
		e.affiche();
		System.out.println("decrémente de 50");
		s="50";
		e.decremente(Integer.parseInt(s));
		e.affiche();
	}
}