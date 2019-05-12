import java.io.*;

public class JeuChifoumi
{

	public static void main(String[]args)
		{
			chifoumi C=new chifoumi();
			do{
				C.getchoixJoueur();
				C.getchoixMachine();
				C.resultatJeu();
				C.affichechoix();
				
			}while(C.m<3 && C.j<3);
			System.out.println("La machine a gagné "+C.m + "toto " );
			System.out.println("Vous avez gagné "+C.j);
		}
}
