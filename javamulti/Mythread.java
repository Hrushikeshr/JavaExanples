package javamulti;


public class Mythread extends Thread{
	
	// call the run() method using the start() method
	public void run() {
		
		System.out.println("thread is starting...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mythread t = new Mythread();
		t.start();  // this is called run(), method
		
		// t.start();  -- error
		
		
		// It does not start a separate call stack   
		// t.run();

	}

}
