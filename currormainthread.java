package multithreading;

public class currormainthread extends Thread
{
	public void run()
	{
	String n = Thread.currentThread().getName();
	
	System.out.println(n);

}}
class a
{
	public static void main(String [] args)
	{
		currormainthread a = new currormainthread();
		currormainthread b = new currormainthread();
		currormainthread c = new currormainthread();
		
		a.start();
		b.start();
		c.start();
		
		String n = Thread.currentThread().getName();
		for(int i=1; i<3; i++)
		{
			System.out.println(n);
		}
		
	}
}