


public class Test3 {

	public static void main(String[] args) {
		habitation HI,HE,HP;
		HE=(habitation)(new HabitationIndividuelle("lolo","2121, rue .....",15,"maison",18,false));
		HI=(habitation)(new HabitationIndividuelle("lolo","452, rue .....",85.9,"maison",15,true));
		HP=(habitation)(new HabitationProfessionnelle("lala","4955,.qsqsqs",100,"bat",50));
		ImpotFoncierDuSecteur set=new ImpotFoncierDuSecteur("secteurnord");
		set.ajoutHabitation(HI);
		set.ajoutHabitation(HP);
		set.ajoutHabitation(HE);
		Percepteur p=new Percepteur("azert","1234");
		p.setSecteur(set);
		p.calculerLesImpotsduSecteur();
		p.ajouterHabitation("ssdd", "482.54sssss", 80, "usine", 25);
		p.ajouterHabitation("assdfd", "95,dsdsqd", 15, 5," cabane", true);
		p.calculerLesImpotsduSecteur();
		
	}

}
