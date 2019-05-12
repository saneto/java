import java.io.*;

public class startEntier{
	public static void main(String[] args){
		Entier ent = new Entier(0);
		int puis=0, choix=0, initnb=0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		do{
			System.out.println("\n\n~~~~~~~~~~~~ Menu ~~~~~~~~~~~~");
			System.out.println(" [0]  Sortir");
			System.out.println(" [1]  Afficher le nombre");
			System.out.println(" [2]  Initialiser le nombre");
			System.out.println(" [3]  Calculer la somme du nombre");
			System.out.println(" [4]  Calculer la puissance du nombre");
			System.out.println(" [5]  Calculer la factorielle du nombre");
			System.out.print("      Choix : ");
			try {	choix = Integer.parseInt(in.readLine());
			}catch(IOException E){}
			
			switch(choix){
				case 0:	break;
				case 1:	ent.afficheValeur();
						break;
				case 2:	System.out.print("Entrez la valeur du nombre : ");
						try {	initnb = Integer.parseInt(in.readLine());
						}catch(IOException E){}
						ent.valeur = initnb;
						break;
				case 3:	System.out.println("La somme du nombre est : "+ent.somme());
						break;
				case 4:	System.out.print("Entrez la puissance : ");
						try {	puis = Integer.parseInt(in.readLine());
						}catch(IOException E){}
						//System.out.println("La puissance "+puis+" du nombre est : "+ent.puissance(puis));
						System.out.println(initnb+"^"+puis+" = "+ent.puissance(puis));
						break;
				case 5:	//System.out.println("La factorielle du nombre est : "+ent.factorielle());
						System.out.println(initnb+"! = "+ent.factorielle());
						break;
				default: System.out.println("\tChoix non valide!");
			}
		}while(choix != 0);
	}
}
