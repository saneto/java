package sync;

public class testThread6 {
	public static void main(String[] args) {
		boite b = new boite();
		Thread6 th1 = new Thread6("liretab1");
		Thread6 th2 = new Thread6("liretab2");
		
		th1.tableau = b;
		th2.tableau = b;
		
		th1.start();
		th2.start();
	}
}
