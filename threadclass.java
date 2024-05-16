package multithreading;

public class threadclass extends Thread//tread is predifine clas of java.io.land pakage
{
@Override 
public void run()
{
	try
	{
		for(int i=1; i<6;i++)
		{
			System.out.println("hi");
			
			Thread.sleep(500);
		}
	}
	catch(InterruptedException  i)
	{
		
	}


	}
class teat
{
	public static void main(String [] args) throws InterruptedException //try catch se bhi aane wale exception ko handle kr skte he
	{
		threadclass a = new threadclass();
		a.start();
		
		//multiple tread chalana he toh
		for(int i=1; i<6;i++)
		{
			System.out.println("hello");
			
			Thread.sleep(500);
		}
		
		
		
		
	}
}

}