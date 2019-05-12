import agenda.*;

public class TestIndividu{
	public static void main (String args[]){
		Individu i1 = new Individu("Alain", "Coincoin", 12);
		
		int i;
		
		System.out.println("L'individu :");
		i1.afficheIndividu();
		System.out.println(i1.getAge());
		
		i1.setPrenom("Cuicui");
		i1.setNom("Pewpew");
		i1.setAge(15);
		
		System.out.println("L'individu moddifié :");
		System.out.println(i1.getPrenom());
		System.out.println(i1.getNom());
		System.out.println("Age : "+i1.getAge());
	}
}
