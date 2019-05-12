import Formes.*;

public class TestFormeGeometrique{
	public static void main(String args[]){
		Cercle c1 = new Cercle(0, 0, 10);
		Rectangle r1 = new Rectangle(20, 20, 5, 7);
		TriangleRectangle t1 = new TriangleRectangle(40, 40, 6, 9);
		
		System.out.println("c1.estPlusGrandQue(r1) : "+c1.estPlusGrandQue(r1));
		System.out.println("c1.estPlusGrandQue(t1) : "+c1.estPlusGrandQue(t1));
		System.out.println("r1.estPlusGrandQue(t1) : "+r1.estPlusGrandQue(t1));
		System.out.println("t1.estPlusGrandQue(c1) : "+t1.estPlusGrandQue(c1));
		System.out.println("r1.estPlusGrandQue(r1) : "+r1.estPlusGrandQue(r1));
	}
}
