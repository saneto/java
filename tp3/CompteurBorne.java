package Compteurs;

public class CompteurBorne{
	private int borneI, valeur, borneS;
	
/**
 * Constructeur
 * Instancie les données membre à des valeurs utilisables
 * @since 1.0
 */
	public CompteurBorne(){
		borneI = 0;
		valeur = 50;
		borneS = 100;
	}
/**
 * Constructeur
 * Instancie les données membre à des valeurs utilisables
 * @param min La borne inférieure du compteur
 * @param max La borne supérieure du compteur
 * @since 1.0
 */
	public CompteurBorne(int min, int max){
		borneI = min;
		valeur = (min+max)/2;
		borneS = max;
	}
/**
 * Constructeur
 * Instancie les données membre à des valeurs utilisables
 * @param min La borne inférieure du compteur
 * @param val La valeur du compteur
 * @param max La borne supérieure du compteur
 
 * @since 1.0
 */
	public CompteurBorne(int min, int val, int max){
		borneI = min;
		valeur = val;
		borneS = max;
	}
	
/**
 * Affiche la valeur actuelle du compteur 
 * @since 1.0
 */
	public void affiche(){
		System.out.println("Valeur = " +valeur+ "\nBorne inférieure = " +borneI+ "\nBorne supérieure = " +borneS);
	}
	
/**
 * Incrémente de 1 le compteur jusqu'à la valeur maximale borneS
 * @return void
 * @since 1.0
*/
	public void incremente(){
		if((valeur++)>borneS) valeur = borneS;
	}
	

/**
 * Décrémente de 1 le compteur jusqu'à la valeur minimal borneI
 * @return void
 * @since 1.0
*/
	public void decremente(){
		if((valeur--)<borneI) valeur = borneI;
	}
	

/**
 * Incrémente de "pas" le compteur jusqu'à la valeur maximale borneS
 * @param pas le nombre de d'incrémentations à faire
 * @return void
 * @since 1.0
*/
	public void incremente(int pas){
		if((valeur += pas)>borneS) valeur = borneS;
	}
	
/**
 * Décrémente de "pas" le compteur jusqu'à la valeur minimal borneI
 * @param pas le nombre de décrémentations à faire
 * @return void
 * @since 1.0
*/
	public void decremente(int pas){
		if((valeur -= pas)<borneI) valeur = borneI;
	}
}
