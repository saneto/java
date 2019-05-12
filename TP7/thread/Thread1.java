package thread;

public class Thread1 extends Thread{
	String nom;
		
	public Thread1(String s){
		nom = s;
	}
	
	public void run(){
		String ch = getName();
		if((nom.compareTo("Pluies"))==0) setPriority(MIN_PRIORITY);
		if((nom.compareTo("Soleil"))==0) setPriority(MIN_PRIORITY);
		if((nom.compareTo("Neiges"))==0) setPriority(MAX_PRIORITY);
		for (int i =0; i<10; i++){
			int priorite = getPriority();
			System.out.println(nom+" --- i = "+i+" --- priorité : "+priorite);
		}
	}
}
