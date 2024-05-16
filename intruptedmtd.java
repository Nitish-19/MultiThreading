package multithreading;

public class intruptedmtd extends Thread
{
	
	public void run() {
		
		
			try {
				
				for(int i=1; i<=5; i++) {
					
					System.out.println("t1 thread running");
				Thread.sleep(1000);
			             } }
				catch (InterruptedException e) {
				
				System.out.println("t1 thred terminated");
				}}}		

class g{
	
	
	public static void main(String [] args) {
		
		intruptedmtd t1 = new intruptedmtd();
		t1.start();//internally run ko call krta he
		t1.interrupt();//phelebar thred wating me jayga tabhi hum usse intrut kr denge
		//intruted ruunig me kaam nhi krta he waitting me hi kaam krta he
		
		
	}
}