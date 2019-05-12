package lesemployes;

public class MainEmploye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ouvrier o1, o2 ;
		o1 = new Ouvrier("Aimar","Jean",20);
		o2 = new Ouvrier("Benhammed","Youssouf",22);
		AgentMaitrise ag = new AgentMaitrise("Gable","Clarck",30);
		Cadre c = new Cadre("Donald","Duck",35) ;
		
		Unite u = new Unite() ;
		u.ajouterEmploye(o1);
		u.ajouterEmploye(c);
		u.ajouterEmploye(o2);
		u.ajouterEmploye(ag);
		u.voirLesEmployes();
		
		boolean b = u.ajouterEmploye(new Ouvrier("Durand","Larbi",22));
		if (b==true) System.out.println("Ajouté");
		else System.out.println("Déjà présent");
		
	}

}
