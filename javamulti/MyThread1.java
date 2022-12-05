package javamulti;

class ABC implements Runnable {  
	
	public void run() {  
  
		// try-catch block  
		try  {  
			
			// moving thread t2 to the state timed waiting  
			Thread.sleep(100);  
		}  
		catch (InterruptedException ie)  {  
			
			ie.printStackTrace();  
			
		}  
  
  
		System.out.println("The state of thread t1 while it invoked "
				+ "the method join() on thread t2 -"+ MyThread1.t1.getState());  
  
		// try-catch block  
		try {  
			
			Thread.sleep(200);  
		}  
		catch (InterruptedException ie) {  
			
			ie.printStackTrace();  
		}     
	}  
}  
  
// ThreadState class implements the interface Runnable  
public class MyThread1 implements Runnable { 
	
	public static Thread t1;  
	public static MyThread1 obj;  
  
	// main method   
	public static void main(String argvs[]) {  
		
		// creating an object of the class ThreadState  
		obj = new MyThread1();  
		t1 = new Thread(obj);  
  
		// thread t1 is spawned   
		// The thread t1 is currently in the NEW state.  
		System.out.println("The state of thread t1 after spawning it - " + t1.getState());  
  
		t1.start();  
  
        // thread t1 is moved to the Runnable state  
		System.out.println("The state of thread t1 after invoking the"
				+ " method start() on it - " + t1.getState());  
	}  
  
	public void run() {  
	
		ABC myObj = new ABC();  
		Thread t2 = new Thread(myObj);  
  
 
		System.out.println("The state of thread t2 after spawning it - "+ t2.getState());  
		t2.start();  
  
 
		System.out.println("the state of thread t2 after calling "
			+ "the method start() on it - " + t2.getState());  
  

		try {  

			Thread.sleep(200);  
			
		}  
		catch (InterruptedException ie) {  
		
			ie.printStackTrace();  
			                                                                                                                   
		}  
  
		System.out.println("The state of thread t2 after invoking "
			+ "the method sleep() on it - "+ t2.getState() );  
  
 
		try {  

			t2.join(); 
			
		}  
		catch (InterruptedException ie) {  
		
			ie.printStackTrace();  
			
		}  
		
		System.out.println("The state of thread t2 when it has"
			+ " completed it's execution - " + t2.getState());  
	}  
  
}  