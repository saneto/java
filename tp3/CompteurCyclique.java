package Compteurs;

public class CompteurCyclique{
	private int borneI, valeur, borneS;
	
	public CompteurCyclique(){
		borneI = 1;
		valeur = 10;
		borneS = 20;
	}
	
	public CompteurCyclique(int min, int max){
		borneI = min;
		valeur = (min+max)/2;
		borneS = max;
	}
	
	public CompteurCyclique(int min, int val, int max){
		borneI = min;
		valeur = val;
		borneS = max;
	}
	
	public void incremente(){
		if((valeur++)>borneS) valeur = borneI;
	}
	
	public void decremente(){
		if((valeur--)<borneI) valeur = borneS;
	}
	
	public void incremente(int pas){
		if((valeur += pas)>borneS) while(valeur>borneS) valeur-=(borneS-borneI);
	}
	
	public void decremente(int pas){
		if((valeur -= pas)<borneI) while(valeur<borneI) valeur+=(borneS-borneI);
	}
	
	public void affiche(){
		System.out.println("Valeur = " +valeur);
	}
}