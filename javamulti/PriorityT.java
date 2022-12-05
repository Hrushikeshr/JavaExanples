package javamulti;

public class PriorityT extends Thread {
	
	 public void run()  
	    {    
	        System.out.println("running thread name is:"+Thread.currentThread().getName());    
	    }    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// creating two threads  
		PriorityT t1 = new PriorityT();    
		PriorityT t2 = new PriorityT();    
		
        // print the default priority value of thread  
        System.out.println("t1 thread priority : " + t1.getPriority());   
        System.out.println("t2 thread priority : " + t2.getPriority());  
        
        
   
        t1.start();    
        t2.start();  
		
		

	}

}
