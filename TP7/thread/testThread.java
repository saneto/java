package thread;

public class testThread {
	
	public static void main(String[] args) {
		Thread1 th1 = new Thread1("Pluies");
		Thread1 th2 = new Thread1("Soleil");
		Thread1 th3 = new Thread1("Neiges");
				
		th1.start();
		th2.start();
		th3.start();
	}
}
