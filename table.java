package multithreading;

public class table {

	public synchronized void printtable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(n*i +" ");
		}
		System.out.println();
	}
}

class thread1 extends Thread
{
	table t1;
	
	thread1(table t1)
	{
		this.t1=t1;
	}
	public void run()
	{
		t1.printtable(5);
	}
}

class thread2 extends Thread
{
	table t2;
	
	thread2(table t2)
	{
		this.t2=t2;
	}
	public void run()
	{
		t2.printtable(7);
	}
}

class main
{
	public static void main(String  args[]) {
		table t = new table();
		thread1 t1 = new thread1(t);
		thread2 t2 = new thread2(t);
		
		t1.start();
		t2.start();
		
	}
}