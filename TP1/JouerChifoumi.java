import java.io.*;
public class JouerChifoumi{
	public static void main(String[] args){
		int i=0, nb=1, victoires=0;
		BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Choisissez le nombre de points à avoir pour gagner : ");
		try{
			nb = Integer.parseInt(clavier.readLine());
		}catch(IOException E){}

		while (victoires < nb)
		{
			Chifoumi lala = new Chifoumi();
			lala.getChoixJoueur();
			lala.getChoixMachine();
			lala.afficheChoix();
			victoires += lala.resultatJeu();
			i++;
		}

		System.out.println("--- --- --- ---");
		System.out.println("La partie est terminée");
		System.out.println("Vous avez gagné " + victoires + " fois en " + i + " parties.");
		System.out.println("--- --- --- ---");
		
	}
	
}
