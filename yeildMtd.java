package multithreading;

public class yeildMtd extends Thread{
	
	public void run() {
		
		String name = Thread.currentThread().getName();
		for(int i=1; i<=3; i++) {
			
			System.out.println(name);
		}
	}
}
	public class thead5 extends Thread{
		
		public void run() {
			
			String name = Thread.currentThread().getName();
			for(int i=1; i<=3; i++) {
				
				System.out.println(name);//ex baar print hoga phir nhi
				
				Thread.yield();//yeah apne thread ko rok ke dusre thread ko chamce deti he
			}
		}
		
	}
class n{
	public static void main(String[] args) {
		
		yeildMtd t1= new yeildMtd();
		thead5 t2 = new thead5();
		
		
		
	}
	

	}

