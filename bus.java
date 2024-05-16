package multithreading;


public class bus implements Runnable {
	
	int available=1,passenger;
	
	bus(int passenger){
		
		this.passenger=passenger;//passenger=1;
	}
	@Override
	public synchronized void run()///  t1 t2 t3 aa jynge saet 1 he mil teeno ko gyi he toh this case use syncronization
	{
		// TODO Auto-generated method stub
		
		String name = Thread.currentThread().getName();
		
		if(available>=passenger) {
			
			System.out.println(name+"reserved seat");
			
			available = available-passenger;
		}else {
			
			System.out.println("sorry seat not avialable");
		}}		

}

class customer{
	public static void main(String [] args) {
		
		bus b1 = new bus(1);
		
		Thread t1= new Thread(b1);
		Thread t2= new Thread(b1);
		Thread t3= new Thread(b1);
		
		t1.setName("yuvraj");
		t2.setName("arjur");
		t3.setName("mohint");
		t1.start();t2.start();t3.start();
		

	}
}