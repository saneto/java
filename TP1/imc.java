import java.io.*;

public class imc{
	double taille, poids, imc;
	
	public imc(){
	}
	
	public void calculImc(){
		imc = poids/(taille*taille);
	}
	
	public void afficheImc(){
		System.out.println("L'IMC est de "+imc+". ");
	}
	
	public void saisiePoids(double p){
		poids = p;
	}
	
	public void saisieTaille(double t){
		taille = t;
	}
}
