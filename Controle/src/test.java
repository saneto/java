
public class test {

	public static void main(String[] args) 
	{
		HabitationIndividuelle  HI;
		HI=new HabitationIndividuelle("lolo","452, rue .....",85.9,"maison",15,true);
		HI.calculImport();
		HI.affiche();
		HabitationProfessionnelle HP;
		HP=new HabitationProfessionnelle("lala","4955,.qsqsqs",100,"bat",50);
		HP.calculImport();
		HP.affiche();
	}

}
