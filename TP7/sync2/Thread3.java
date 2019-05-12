package sync2;

public class Thread3 extends Thread{
	String nom;
	int debut, fin;
	
	public Thread3(String nom, int debut, int fin){
		this.debut = debut;
		this.nom   = nom;
		this.fin   = fin;
	}
	
	public void run(){
		for(int i=debut; i<fin; i++)	
			synchronized(System.out){ System.out.println(nom+" "+i+" ");}
	}
	
	public static void main(String[] args){
		Thread3 th1 = new Thread3("Soleil", 10, 30);
		Thread3 th2 = new Thread3("Pluies", 30, 50);
		
		th1.start();
		th2.start();
	}
}
