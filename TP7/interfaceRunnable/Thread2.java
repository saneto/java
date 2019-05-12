package interfaceRunnable;

public class Thread2 implements Runnable{
	String chaine;
	
	Thread2(String chaine){
		this.chaine = chaine;
	}
	
	public void run(){
		for (int i=0; i<2; i++){
			System.out.println(chaine+" "+Thread.currentThread());
		}
	}
	
	public static void main(String[] args){
		Thread2 th1 = new Thread2("Soleil");
		Thread2 th2 = new Thread2("Pluies");
		Thread2 th3 = new Thread2("Neiges");

		new Thread(th1).start();
		new Thread(th2).start();
		new Thread(th3).start();
	}
}
