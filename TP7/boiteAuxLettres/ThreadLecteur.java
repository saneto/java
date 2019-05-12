package boiteAuxLettres;

public class ThreadLecteur extends Thread{
	BAL bal;
	
	public ThreadLecteur(BAL bal){
		this.bal = bal;		
	}
	
	public void lire(){
		String s = bal.retirer();
		if(s!=null)	
			System.out.println("\""+s+"\"\n~Récupéré par: "+getName()+"\n");
	}
	
	public void run(){
		for(int i=0; i<30; i++)	lire();
	}
}
