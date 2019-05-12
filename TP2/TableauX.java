import java.io.*;
import java.lang.*;

public class TableauX{
	int Tab[];
	static String tabC[];
	static int Nc;
	int N, i;
	BufferedReader clavier;
	
	public TableauX(int nb){
		clavier = new BufferedReader(new InputStreamReader(System.in));
		N = nb;
		Nc = nb;
		Tab = new int[N];
		tabC = new String[N];
	}
	
	
	public void afficheTab(){
		for(i =0; i<N; i++)	System.out.println("Tab["+i+"] = "+Tab[i]);
	}
	
	public void saisieTab(){
		for(i=0; i<N; i++){
			System.out.println("Entrez l'element "+(i+1)+" : ");
			try {Tab[i] = Integer.parseInt(clavier.readLine());}catch(IOException E){}	
		}
	}
	
	public int getPlusGrand(){
		int plusGrand = Tab[0];
		for(i=1; i<N; i++)	if(Tab[i] > plusGrand) plusGrand = Tab[i];
		return plusGrand;
	}
	
	public int getPlusPetit(){
		int plusPetit = Tab[0];
		for(i=1; i<N; i++)	if(Tab[i] < plusPetit) plusPetit = Tab[i];
		return plusPetit;
	}
	
	public boolean rechercheNombre(int nb){
		for(i=0; i<N; i++)	if(Tab[i] == nb) return true;
		return false;
		
	}	
	
	public void remplirTableau(){
		for(i=0; i<N; i++){
			Tab[i] = (int)(Math.random()*201);
		}
	}
	
	public void triABulle(){
		int j, temp;
	    for (j=N; j>1; j--)
   		{
		    //Boucle qui parcours le tableau d'éléments à ranger
		    for (i=0; i<j-1; i++)
		    {
		        //Permutation
		        if(Tab[i] > Tab[i+1])
		        {
		            temp = Tab[i];
		            Tab[i] = Tab[i+1];
		            Tab[i+1] = temp;
		        }
		    }
    	}
	}
	
	static void decroissant(){
		int j, i;
		String temp;
	    for (j=Nc; j>1; j--)
   		{
		    //Boucle qui parcours le tableau d'éléments à ranger
		    for (i=0; i<j-1; i++)
		    {
		        //Permutation
		        if(tabC[i].compareTo(tabC[i+1])<0)
		        {
		            temp = tabC[i];
		            tabC[i] = tabC[i+1];
		            tabC[i+1] = temp;
		        }
		    }
    	}
	}
	
	static void croissant(){
		int j, i;
		String temp;
	    for (j=Nc; j>1; j--)
   		{
		    //Boucle qui parcours le tableau d'éléments à ranger
		    for (i=0; i<j-1; i++)
		    {
		        //Permutation
		        if(tabC[i].compareTo(tabC[i+1])>0)
		        {
		            temp = tabC[i];
		            tabC[i] = tabC[i+1];
		            tabC[i+1] = temp;
		        }
		    }
    	}
	}	
	
	public void saisieTabc(){
		for(i=0; i<N; i++){
			System.out.println("Entrez l'element "+(i+1)+" : ");
			try {tabC[i] = clavier.readLine();}catch(IOException E){}	
		}
	}
	
	public void afficheTabc(){
		for(i=0; i<Nc; i++)	System.out.println("Tab["+i+"] = "+tabC[i]);
	}
}
