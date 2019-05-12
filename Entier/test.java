import java.io.*;

public class test
{
	public static void main(String[] args)
	{
		Entier e;
		String s="";
		BufferedReader c;
		c=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Commencez par saisir un entier : ");
		try
		{
			s=c.readLine();
		}catch(IOException p){}
		e=new Entier(Integer.parseInt(s));
		String puis="";
		String choix = "";
		int ret;
		do
		{
			System.out.println("\t\t\tMenu\n\n");
			System.out.println("Pour calculer la factorielle de "+s+", tapez\t\t\t1");
			System.out.println("Pour calculer la somme des nombres allant de 0 à "+s+", tapez\t2");
			System.out.println("Pour calculer votre nombre à la puissance de votre choix, tapez\t3");
			try
			{							
				choix = c.readLine();
			}catch(IOException p){}
			switch(Integer.parseInt(choix))
			{
				case 1 :ret=e.factorielle();
					System.out.println("La factorielle de "+s+"vaut : "+ret);
					break;
				case 2 :ret=e.somme();
					System.out.println("La somme des nombres allant de 0 à "+s+" vaut : "+e.somme());
					break;
				case 3 :
					System.out.println("Veuillez saisir la puissance souhaitée : ");
					try
					{							
						puis = c.readLine();
					}catch(IOException p){}
					ret=e.puissance(Integer.parseInt(puis));
					System.out.println("\n"+s+" puissance "+puis+" vaut "+ret);
					break;
				case 0 :
					System.out.println("Fin du programme ...");
					break;
			}
		}while(Integer.parseInt(choix)!=0);
	}           
}
