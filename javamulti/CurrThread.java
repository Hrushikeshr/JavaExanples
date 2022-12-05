package javamulti;

public class CurrThread extends Thread {
	
	// currentThread  --  It returns a reference to the currently executing thread object.
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CurrThread ct, ct2; 
		
		ct = new CurrThread();
		
		ct.start();
		
		ct2 = new CurrThread();
		
		ct2.start();

	}

}
