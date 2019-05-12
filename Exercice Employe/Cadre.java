package lesemployes;

public class Cadre extends Employe  {

	public Cadre(String name, String address, int number) {
		super(name, address, number);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculPaye(double base) {
		// TODO Auto-generated method stub
		return 0.72*base - 70;
	}
}
