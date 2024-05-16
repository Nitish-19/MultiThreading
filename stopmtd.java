package multithreading;

public class stopmtd extends Thread//terminate thread parmanetlty

{
public void run() {
		String name = Thread.currentThread().getName();
		
		for (int i=1 ; i<=3; i++)
		{
			
			System.out.println(name);
			
			
		}
		}}
class f{
	public static void main (String [] args) {
		// TODO Auto-generated method stub
		stopmtd t1 = new stopmtd();
		stopmtd t2 = new  stopmtd();
		stopmtd t3 = new stopmtd();
		t1.setName("yuvraj");
		t2.setName("arjun");
		t3.setName("lalit");
		
		t1.start();
		t2.start();
		t3.start();
		t2.stop();
		

	}
}