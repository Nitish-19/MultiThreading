package multithreading;

public class setgetpriority extends Thread
{

	public void run()
	{
	String n = Thread.currentThread().getName();
	
	System.out.println(n);
	 
int p = Thread.currentThread().getPriority();//bydefult 5 priority hoti he
	System.out.println(p);
}}
class test
{
	public static void main(String [] args)
	{
		setgetpriority a = new setgetpriority();
		setgetpriority b = new setgetpriority();
		setgetpriority c = new setgetpriority();
		
		
		
		
		a.setName("yuvi");
		b.setName("singh");
		c.setName("patel");
		
		a.setPriority(7);
		b.setPriority(15);
		c.setPriority(3);
		
		
		a.start();
		b.start();
		c.start();
		
		
		
		
	}
}
