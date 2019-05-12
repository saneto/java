import laposte.*;
public class Testsacpostal {

	public static void main(String[] args) {
		Lettre l1, l2 ;
		l1 = new Lettre(false);
		l2 = new Lettre(true) ;

		Paquet p1, p2 , p3;
		p1 = new Paquet(2);
		p2 = new Paquet(3);
		p3 = new Paquet(4);
		Sac s = new Sac() ;
		s.remplirSac(l1);
		s.remplirSac(p1);
		s.remplirSac(l2);
		s.remplirSac(p2);
		s.remplirSac(p3);

		s.affranchir();
	}
}
