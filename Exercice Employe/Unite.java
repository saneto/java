package lesemployes;

import java.util.Vector;

public class Unite {
	
private Vector<Employe> Liste ;

public Unite() {/*  Crée le vecteur    A coder      */
	Liste = new Vector<Employe>() ;
	
}
public boolean ajouterEmploye(Employe e) {		 
/* Doit vérifier que l'employé est nouveau   A coder       */
// On suppose que 2 employes peuvent avoir le même nom mais un numéro différent
 for (Employe emp : Liste) {
	 int n = emp.getNumber() ;
	 if ( n== e.getNumber()) {
		 System.out.println("Employé déjà présent, vérifié par son numéro");
		 return false ;
	 }
   }
 Liste.add(e);
 return true ;
 }

public void voirLesEmployes() {			 /*    Visualise tous les employés   A coder         */
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
			/*  Recherche un employé à partir de son nom           A coder            */
	for (Employe e : Liste) {
		if ( e.getName().compareTo(nom)==0)
			return e ;
	}
	return null ;
   }
}
