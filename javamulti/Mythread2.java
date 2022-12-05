package javamulti;

public class Mythread2 implements Runnable {
	
	public void run(){  
		
		System.out.println("thread is running...");  
		
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mythread2 t = new Mythread2();
		
		Thread t1 = new Thread(t);
		t1.start();    // this will call run() method  
		
		// t1.start();  , give error, if we call the start(), more than once

	}

}
