package javamulti;

public class CountT extends Thread {

	CountT(String threadname, ThreadGroup tg)  
	    {  
	        super(tg, threadname);  
	        start();  
	    }  
	
	    public void run()  
	    {  
	       System.out.println("running thread name is: "+Thread.currentThread().getName());    
	    }  
	    
	    
	    public static void main(String arg[])  
	    {  
	        // creating the thread group  
	        ThreadGroup g1 = new ThreadGroup("parent thread group");  
	  
	        // creating a thread   
	        CountT t1 = new CountT("Thread-1", g1);  
	        
	        
	        // creating another thread   
	        CountT t2 = new CountT("Thread-2", g1);  
	  
	        // checking the number of active thread  
	        System.out.println("number of active thread: "+ g1.activeCount());  
	        
	    }  

}
