package sync;

public class boite {
	int[] Tableau;
	
	public boite(){
		Tableau = new int[30];
		for (int i=0; i<30; i++) Tableau[i]=i;
	}
	
	public synchronized void afficher(){
	//public void afficher(){
		for(int i=0; i<30; i++)	System.out.print(Tableau[i]+" ");
		System.out.println();
	}
}