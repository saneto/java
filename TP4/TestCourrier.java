import java.io.*;
import sacPostal.*;

public class TestCourrier{
	public static void main(String args[]){
		Sac s1 = new Sac();
		boolean continuer = true;
		
		Lettre l1 = new Lettre(true);
		Lettre l2 = new Lettre(true);
		Lettre l3 = new Lettre(false);
		Lettre l4 = new Lettre(true);
		Lettre l5 = new Lettre(true);
		Lettre l6 = new Lettre(false);
		
		Paquet p1 = new Paquet(1);
		Paquet p2 = new Paquet(2);
		Paquet p3 = new Paquet(3);
		Paquet p4 = new Paquet(4);
		Paquet p5 = new Paquet(5);
		
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





























