import java.io.*;
import java.lang.Math;

public class Chifoumi{
	int ChoixMachine, ChoixJoueur;
	BufferedReader clavier;

	public Chifoumi(){
		clavier = new BufferedReader(new InputStreamReader(System.in));
	}

	public String conversion (int choix){
		switch(choix){
			case 0: return "Caillou";
			case 1: return "Papier";
			case 2: return "Ciseaux";
			default: return null;
		}
	}
	
	public void afficheChoix(){
		System.out.print("Vous avez choisis " +ChoixJoueur+ ", la machine a choisis " +ChoixMachine + ". ");
	}
	
	public int resultatJeu(){
		String res="";

		if(ChoixJoueur==0) if(ChoixMachine==0) res="égalité";
		if(ChoixJoueur==0) if(ChoixMachine==1) res="perdu";
		if(ChoixJoueur==0) if(ChoixMachine==2) res="gagné";
		if(ChoixJoueur==1) if(ChoixMachine==0) res="gagné";
		if(ChoixJoueur==1) if(ChoixMachine==1) res="égalité";
		if(ChoixJoueur==1) if(ChoixMachine==2) res="perdu";
		if(ChoixJoueur==2) if(ChoixMachine==0) res="perdu";
		if(ChoixJoueur==2) if(ChoixMachine==1) res="gagné";
		if(ChoixJoueur==2) if(ChoixMachine==2) res="égalité";

		System.out.println("Vous avez "+res);

		if(res.equals("gagné")) return 1;
		else return 0;
	}

	public void getChoixMachine(){
		ChoixMachine = (int)(3*Math.random());
	}

	public void getChoixJoueur(){
		System.out.println("0:Caillou\t1:Papier\t2:Ciseaux");
		try{
			ChoixJoueur = Integer.parseInt(clavier.readLine());
		}catch(IOException E){}
	}

}


