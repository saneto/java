package lesemployes;

public class Ouvrier extends Employe {
	public Ouvrier(String name, String address, int number) {
		super(name, address,  number);
	}
 public double calculPaye(double base) {
	 return base*0.80 ;
 }
}
