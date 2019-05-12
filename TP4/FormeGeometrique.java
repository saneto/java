package Formes;

public abstract class FormeGeometrique{
	protected double posX, posY;
	
	void deplacer(double x, double y){
		posX = x;
		posY = y;
	}
	
	void afficherPostition(){
		System.out.println("Position : ("+posX+","+posY+")");
	}
	
	abstract double surface();
	abstract double perimetre();
	
	public int estPlusGrandQue(FormeGeometrique fg){
		if(surface() > fg.surface()) return 1;
		else if(surface() < fg.surface()) return -1;
		else return 0;
	}
	
}
