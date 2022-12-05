package javamulti;

public class SetPrio extends Thread {
	
	// It changes the priority of the thread.
	
	
	public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SetPrio t1=new SetPrio();    
		SetPrio t2=new SetPrio();
		SetPrio t3=new SetPrio();
         
        t1.setPriority(Thread.MAX_PRIORITY);    
         
        t1.start();  
        
        t2.setPriority(Thread.MIN_PRIORITY);    
        
        t2.start();  
        
        t3.setPriority(Thread.NORM_PRIORITY);    
        
        t3.start();  



	}

}
