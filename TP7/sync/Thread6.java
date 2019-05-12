package sync;

public class Thread6 extends Thread{
	String nom;
	public boite tableau;
	
	public Thread6(String nom){
		this.nom = nom;
	}
	
	public void run(){
		tableau.afficher();
	}
}