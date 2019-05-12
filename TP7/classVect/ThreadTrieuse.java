package classVect;


public class ThreadTrieuse extends Thread {
    boolean finished = false;
    Vect bal;
    
    public ThreadTrieuse(Vect bal){
    	this.bal = bal;
    }
	
	public void run(){
		try{
            while(!finished){
        		bal.sort();
                bal.affichage();
                Thread.sleep (5000);
            }
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void end(){
		finished = true;
		System.out.println("Fin du thread.");
	}
}
