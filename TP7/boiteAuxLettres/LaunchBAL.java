package boiteAuxLettres;

public class LaunchBAL {

	public static void main(String[] args) {
		BAL bal1 = new BAL();

		ThreadEcrivain write1 = new ThreadEcrivain(bal1, "e1");	
		ThreadEcrivain write2 = new ThreadEcrivain(bal1, "e2");	
		ThreadEcrivain write3 = new ThreadEcrivain(bal1, "e3");
		ThreadLecteur read1 = new ThreadLecteur(bal1);

		write1.start();
		write2.start();
		write3.start();
		read1.start();

	}
}
