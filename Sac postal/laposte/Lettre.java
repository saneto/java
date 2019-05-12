package laposte;

public class Lettre extends Courrier{
   public Lettre(boolean vitesse){
	   Vitesse= vitesse ;
   }
   public void affranchir() {
	   if (Vitesse==true)
		   Timbre = "0.80";
   }
   public void afficher() {
	   System.out.println("Lettre timbrée à "+Timbre);
   }


}
