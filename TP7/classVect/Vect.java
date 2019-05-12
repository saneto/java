package classVect;
import java.util.*;

public class Vect {
	Vector<String> vecteur = new Vector<String>();
	
	public synchronized void add(String str){
		vecteur.addElement(str);
	}
	
	public synchronized void sort(){
		System.out.println("Triage en cours..");
		
		if(!vecteur.isEmpty()){
			Collections.sort(vecteur);
		}
	}
	
	public void affichage(){
		for(int i=0; i<vecteur.size(); i++){
			System.out.println(vecteur.get(i));
		}
		System.out.println();
	}
}