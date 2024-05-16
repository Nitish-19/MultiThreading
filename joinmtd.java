package multithreading;

public class joinmtd extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		for(int i =1; i<=3 ; i++) {
			System.out.println(name);
		}}

	
class e{

	public static void main(String[] args) {
		
		 joinmtd t1 = new   joinmtd();
		 joinmtd t2 = new   joinmtd();
		 joinmtd t3 = new   joinmtd();
		 
		 t1.setName("yuvraj");
		 t2.setName("deven");
		 
		 t3.setName("arjun");
		 
	
		 t2.start();
		 
		 try {
			 t2.join();
		 }
		 catch(InterruptedException i) {
			 
		 }
		 t2.start();
		 
		 
		 t1.start();
		 t3.start();
		 
		 
		
		
}}}
