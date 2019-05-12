import java.io.*;
import sacPostal.*;

public class TestCourrier_9{
	public static void main(String args[]){
		Sac_9 s1 = new Sac_9();
		boolean continuer = true;
		
		Lettre_9 l1 = new Lettre_9(true);
		Lettre_9 l2 = new Lettre_9(true);
		Lettre_9 l3 = new Lettre_9(false);
		Lettre_9 l4 = new Lettre_9(true);
		Lettre_9 l5 = new Lettre_9(true);
		Lettre_9 l6 = new Lettre_9(false);
		
		Paquet_9 p1 = new Paquet_9(1);
		Paquet_9 p2 = new Paquet_9(2);
		Paquet_9 p3 = new Paquet_9(3);
		Paquet_9 p4 = new Paquet_9(4);
		Paquet_9 p5 = new Paquet_9(5);
		
		if((continuer)&&(s1.remplirSac(l1) != true)) continuer = false;
		if((continuer)&&(s1.remplirSac(l2) != true)) continuer = false;
		if((continuer)&&(s1.remplirSac(l3) != true)) continuer = false;
		if((continuer)&&(s1.remplirSac(l4) != true)) continuer = false;
		if((continuer)&&(s1.remplirSac(l5) != true)) continuer = false;
		if((continuer)&&(s1.remplirSac(l6) != true)) continuer = false;
		
		if((continuer)&&(s1.remplirSac(p1) != true)) continuer = false;
		if((continuer)&&(s1.remplirSac(p2) != true)) continuer = false;
		if((continuer)&&(s1.remplirSac(p3) != true)) continuer = false;
		if((continuer)&&(s1.remplirSac(p4) != true)) continuer = false;
		if((continuer)&&(s1.remplirSac(p5) != true)) continuer = false;
		
		System.out.println("Affranchissement du sac : "+s1.Affranchir());	
		
		s1.AfficherPrixContenu();
	}
}





























