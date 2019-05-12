import agenda.*;
import java.io.*;

public class Test01{
	public static String lireClavier() throws IOException{
		BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		String texte = clavier.readLine();
		return texte;
	}
	public static void main (String args[]) throws IOException{
		String UnNom;
		String UnPrenom;
		int UnAge=0;
		
		System.out.println("Entrez le nom : ");
		UnNom = lireClavier();
		System.out.println("Entrez le prénom : ");
		UnPrenom = lireClavier();
		System.out.println("Entrez l'age : ");
		try{
			UnAge = Integer.parseInt(lireClavier());
		}catch(IOException E){}
		
		Individu pers1 = new Individu();
		pers1.setNom(UnNom);
		pers1.setPrenom(UnPrenom);
		pers1.setAge(UnAge);
		
		pers1.afficheIndividu();
	}
}
