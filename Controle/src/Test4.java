
public class Test4 {

	public static void main(String[] args) 
	{
		
		
		LesPercepteurs lesperc=new LesPercepteurs();
		
		Percepteur pe=new Percepteur("mickey","vivi");
		if(lesperc.isPercepteur(pe)==true)
		{
			System.out.println("vous pouvez ajouter");
		}else{
			System.out.println("login ou mdp invalide");
		}
		
		pe=new Percepteur("fdfdfdd","lemalin");
		if(lesperc.isPercepteur(pe)==true)
		{
			System.out.println("vous pouvez ajouter");
		}else{
			System.out.println("login ou mdp invalide");
		}
		
		pe=new Percepteur("mickey","lemalin");
		if(lesperc.isPercepteur(pe)==true)
		{
		
			pe.ajouterHabitation("lala","4955,.qsqsqs",100,"bat",50);
			pe.ajouterHabitation("lolo","2121, rue .....",15,18,"maison",false);
			pe.calculerLesImpotsduSecteur();
			
		}else{
			System.out.println("login ou mdp invalide");
		}

	}

}
