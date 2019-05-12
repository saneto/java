package lesemployes;

import java.util.Vector;

public class Unite {
	
private Vector<Employe> Liste ;

public Unite() {/*  Cr�e le vecteur    A coder      */
	Liste = new Vector<Employe>() ;
	
}
public boolean ajouterEmploye(Employe e) {		 
/* Doit v�rifier que l'employ� est nouveau   A coder       */
// On suppose que 2 employes peuvent avoir le m�me nom mais un num�ro diff�rent
 for (Employe emp : Liste) {
	 int n = emp.getNumber() ;
	 if ( n== e.getNumber()) {
		 System.out.println("Employ� d�j� pr�sent, v�rifi� par son num�ro");
		 return false ;
	 }
   }
 Liste.add(e);
 return true ;
 }

public void voirLesEmployes() {			 /*    Visualise tous les employ�s   A coder         */
	for (Employe e: Liste) {
		System.out.println(e);
	}
}
public void voirLesEmployesBis(){
	int nb = Liste.size();
	for (int i =0; i< nb ; i++){
		Employe e  = Liste.elementAt(i);
		System.out.println(e);
	}
}
public Employe rechercherUnEmploye(String nom) {		 
			/*  Recherche un employ� � partir de son nom           A coder            */
	for (Employe e : Liste) {
		if ( e.getName().compareTo(nom)==0)
			return e ;
	}
	return null ;
   }
}
