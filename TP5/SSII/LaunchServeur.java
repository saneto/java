package essai1;

public class LaunchServeur{
	public static void main(String []args){
		//test constructeur
		Serveur s1 = new Serveur("srv1", "192.123.123.123", "5E:FF:56:A2:AF:15");
		Serveur s2 = new Serveur("srv2", "192.123.123.124", "5E:FF:56:A2:AF:19");
		SSII entreprise = new SSII();
		
		System.out.println("\nCréation des services 1, 2, 3 sur srv1.");
		//test addService
		s1.addService(1);
		s1.addService(2);
		s1.addService(3);

		System.out.println("Suppression du service 1.\n");
		//test delService
		s1.delService(1);
		
		//test isService
		System.out.println("s1.isService(1) = " + s1.isService(1));
		System.out.println("s1.isService(2) = " + s1.isService(2));
		System.out.println("s1.isService(3) = " + s1.isService(3));
		
		//test activeService
		System.out.println("s1.activeService(2) = " + s1.activeService(2));
		System.out.println("s1.activeService(3) = " + s1.activeService(3));
		
		//test desactiveService
		System.out.println("s1.desactiveService(2) = " + s1.desactiveService(2));
		System.out.println("s1.desactiveService(3) = " + s1.desactiveService(3));
		
		//test activeTout
		System.out.println("\nActivation de tous les services.");
		s1.activeTout();
		s1.etatServices();
		
		//test desactiveTout
		System.out.println("\nDesactivation de tous les services.");
		s1.desactiveTout();
		s1.etatServices();

		System.out.println("------------------------------------------------------");
		
		System.out.println("\nCréation des services 4, 5, 6 sur srv2.");
		//test addService
		s2.addService(4);
		s2.addService(5);
		s2.addService(6);

		System.out.println("Suppression du service 4.\n");
		//test delService
		s2.delService(4);
		
		//test isService
		System.out.println("s2.isService(4) = " + s2.isService(4));
		System.out.println("s2.isService(5) = " + s2.isService(5));
		System.out.println("s2.isService(6) = " + s2.isService(6));
		
		//test activeService
		System.out.println("s2.activeService(5) = " + s2.activeService(5));
		System.out.println("s2.activeService(6) = " + s2.activeService(6));
		
		//test desactiveService
		System.out.println("s2.desactiveService(5) = " + s2.desactiveService(5));
		System.out.println("s2.desactiveService(6) = " + s2.desactiveService(6));
		
		//test activeTout
		System.out.println("\nActivation de tous les services.");
		s2.activeTout();
		s2.etatServices();
		
		//test desactiveTout
		System.out.println("\nDesactivation de tous les services.");
		s2.desactiveTout();
		s2.etatServices();
		

		System.out.println("------------------------------------------------------");
		System.out.println("entreprise.addServeur(s1) = " + entreprise.addServeur(s1));
		System.out.println("entreprise.addServeur(s2) = " + entreprise.addServeur(s2));

		System.out.println("entreprise.desactiveService(\"192.123.123.123\", 3) = " + entreprise.desactiveService("192.123.123.123", 3));
		System.out.println("entreprise.activeService(\"192.123.123.123\", 3)    = " + entreprise.activeService("192.123.123.123", 3));
		System.out.println("entreprise.activeService(\"192.123.123.13\", 3)    = " + entreprise.activeService("192.123.123.13", 3));
		
		System.out.println("Redémarrage du srv2");
		System.out.println("entreprise.desactiveServeur(\"192.123.123.124\") = " + entreprise.desactiveServeur("192.123.123.124"));
		s2.etatServices();
		System.out.println("entreprise.activeServeur(\"192.123.123.124\") = " + entreprise.activeServeur("192.123.123.124"));
		s2.etatServices();
		
		
		System.out.println("entreprise.addService(\"192.123.123.123\", 10) = " + entreprise.addService("192.123.123.123", 10));
		System.out.println("entreprise.delService(\"192.123.123.123\", 10) = " + entreprise.delService("192.123.123.123", 10));

		System.out.println("entreprise.delServeur(s1) = " + entreprise.delServeur(s1));
		
	}
}
