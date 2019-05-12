import java.io.*;

public class startImc{
	public static void main(String[] args){
		imc p = new imc();
		p.saisiePoids(78);
		p.saisieTaille(1.80);
		p.calculImc();
		p.afficheImc();
	}
	
}
