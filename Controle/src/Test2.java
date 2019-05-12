import java.util.Vector;


public class Test2 {

	public static void main(String[] args) {
		Vector<String>v=new Vector<String>();
		String ret;
		habitation HI,HE,HP;
		HE=(habitation)(new HabitationIndividuelle("lolo","2121, rue .....",15,"maison",18,false));
		HI=(habitation)(new HabitationIndividuelle("lolo","452, rue .....",85.9,"maison",15,true));
		HP=(habitation)(new HabitationProfessionnelle("lala","4955,.qsqsqs",100,"bat",50));
		ImpotFoncierDuSecteur set=new ImpotFoncierDuSecteur("secteurnord");
		set.ajoutHabitation(HI);
		set.ajoutHabitation(HP);
		set.ajoutHabitation(HE);
		set.ajoutHabitation(HI);
		set.ajoutHabitation(HP);
		set.calculerImpot();
		set.supprimerHabitation(HE);
		set.calculerImpot();
		set.ajoutHabitation(HE);
		set.calculerImpot();
		v=set.lireAdresses("aa");
		System.out.println("aa possede "+v.size()+" habitation");
		v=set.lireAdresses("lolo");
		System.out.println("lolo possede "+v.size()+" habitation");
		ret=set.lireProprietaire("452, rue .....");
		System.out.println(ret);
		ret=set.lireProprietaire("452");
		System.out.println(ret);

	}

}
