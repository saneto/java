package boiteAuxLettres;

public class ThreadEcrivain extends Thread {
	BAL bal;
	String nom;
	
	public ThreadEcrivain(BAL bal, String nom){
		this.bal = bal;
		this.nom = nom;
	}
	
	public void ecrire(String s){
		//System.out.println(Thread.currentThread());
		bal.deposer(s);
	}
	
	public void run(){
		for(int i=0; i<10; i++)	
		{
			ecrire(nom+" "+i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Bloc catch généré automatiquement
				e.printStackTrace();
			}
		}
	}
}
