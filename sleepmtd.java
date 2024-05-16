package multithreading;

public class sleepmtd extends Thread {

	public void run() {// overidde mtd me exception ko thorw nahi kr skhte
	
	String s = Thread.currentThread().getName();
	{
		try {
		for (int i = 1; i <= 3; i++) {

			System.out.println(s);
		
				Thread.sleep(1000);
			} }catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class b {
	public static void main(String[] args) {

		sleepmtd a = new sleepmtd();

		sleepmtd a1 = new sleepmtd();

		sleepmtd a2 = new sleepmtd();
		
		a.setName("yuvraj");
		a1.setName("anjun");
		a2.setName("deven");

		a.start();
		a1.start();
		a2.start();

	}
}