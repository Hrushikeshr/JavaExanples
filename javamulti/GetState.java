package javamulti;


// getState()	It is used to return the state of the thread.

public class GetState implements Runnable {
	
	
	public void run()   
    {  
        // returns the state of the thread  
        Thread.State state = Thread.currentThread().getState();  
        
        
        System.out.println("Running thread name: "+ Thread.currentThread().getName());  
        System.out.println("State of thread: " + state);  
        
    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GetState g = new GetState();
		
		Thread t1= new Thread(g);   
        Thread t2= new Thread(g);  
        
        // call run() function  
        t1.start();     
        t2.start();  
	}

}
