package lesemployes;

public class AgentMaitrise extends Employe {

	public AgentMaitrise(String name, String address, int number) {
		super(name, address, number);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculPaye(double base) {
		// TODO Auto-generated method stub
		return 0.78 * base -20 ;
	}

}
