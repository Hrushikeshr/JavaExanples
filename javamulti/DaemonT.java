package javamulti;

public class DaemonT extends Thread {
	
	

	public void run()  
    {    
        //checking for daemon thread    
        if(Thread.currentThread().isDaemon())  
        {  
            System.out.println("daemon thread work");    
        }    
        else  
        {    
            System.out.println("user thread work");    
        }    
        
    }    
	
    public static void main(String[] args)  
    {    
        // creating three threads  
    	DaemonT t1=new DaemonT();   
    	DaemonT t2=new DaemonT();    
    	DaemonT t3=new DaemonT();    
    	
        // set user thread t1 to daemon thread    
    	
        t1.setDaemon(true);   // It marks the thread as daemon or user thread.
        
        
        //starting all the threads   
        t1.start();   
        t2.start();    
        
        t3.setDaemon(true);
        t3.start();    
    }    

}
