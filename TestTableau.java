import java.io.*;

public class TestTableau{
	public static void main(String[] args)
	{
		TableauX t;
		BufferedReader c;
		String s="";
		int grand, petit;
		boolean ret;
		c=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Commencez par saisir la taille du tableau : ");
		try
		{
			s=c.readLine();
		}catch(IOException p){}
		t=new TableauX(Integer.parseInt(s));
		t.saisietab();
		t.affichetab();
		System.out.println("Veuillez saisir le nombre a chercher : ");
		try
		{
			s=c.readLine();
		}catch(IOException p){}
		ret=t.rechercheNombre(Integer.parseInt(s));
		if(ret==true)
		{
			System.out.println("le nombre est present dans le tableau");
		}else{System.out.println("le nombre n'est pas present dans le tableau");}
		petit=t.getPlusPetit();
		System.out.println("le chiffre le plus petit  : "+petit);
		grand=t.getPlusGrand();
		System.out.println("le chiffre le plus grand  : "+grand);
		t.valalea();
		t.affichetab();
		t.tri();
		t.affichetab();
	}
}
