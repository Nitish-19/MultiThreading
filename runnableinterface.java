package multithreading;

public class runnableinterface implements Runnable
{
	@Override
public void run()//isko call krna pdega qki tread ko extend nhi kiya
                 
{
	for(int i=0; i<5;i++)
	{
	
		try {
			System.out.println("hi");
			Thread.sleep(600);
		} 
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class test
{
	public static void main(String [] args) {
		runnableinterface s = new runnableinterface();
		Thread t = new Thread();
		t.start();
		for(int i=0; i<5;i++)
		{
		
			try {
				System.out.println("hello");
				Thread.sleep(600);
			} 
			
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	}}}
