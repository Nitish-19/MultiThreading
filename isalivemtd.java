package multithreading;

public class isalivemtd extends Thread {

	 
	 
	 public void run() {
		 
		 System.out.println("isalive method started");
		 
	 }
		
			
		}


class y{
	
	public static void main(String [] args)
	{
		
		isalivemtd a = new isalivemtd();
		isalivemtd a2 = new isalivemtd();
		
		
	//	System.out.println(a.isAlive());//thead start ke phle lga denge toh false return krenge
		a.start();
		System.out.println(a.isAlive());
		a2.start();
		
		
	}
	}

