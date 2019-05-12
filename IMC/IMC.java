import java.io.*;

public class IMC
{
	float taille;
	float poids;
	int imc;
	BufferedReader clavier;
	
	public IMC()
	{
		clavier=new BufferedReader(new InputStreamReader(System.in));
	}
	public void calculIMC()
	{
		imc=poids/(taille*taille);
	}
	public void afficheIMC()
	{
		System.out.println("L'imc =" + imc);
		if(imc>35)
		{
			System.out.println("Obèse");
		}
		if(30<imc && imc<35)
		{
			System.out.println("Trop gros");
		}
		if(27<imc && imc<30)
		{
			System.out.println("attention");
		}
		if(23<imc && imc<37)
		{
			System.out.println("Poids idéal");
		}
		if(18<imc && imc<23)
		{
			System.out.println("Mince");
		}
		if(15<imc && imc<18)
		{
			System.out.println("maigre");
		}
		if(imc>15)
		{
			System.out.println("anorexique");
		}
	}
	public float saisiePoids(float p)
	{
		

