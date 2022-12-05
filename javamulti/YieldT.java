package javamulti;

public class YieldT extends Thread {

		// 	yield()	It causes the currently executing thread object to pause 
	    //      and allow other threads to execute temporarily
	
	
	 public void run()  
	    {  
	        for (int i=0; i<3 ; i++)  
	        	
	            System.out.println(Thread.currentThread().getName() + " thread excute ");  
	    }  
	    public static void main(String[]args)  
	    {  
	    	YieldT t1 = new YieldT();  
	    	YieldT t2 = new YieldT();  
	    	
	        // this will call run() method  
	    	
	        t1.start();  
	        t2.start();  
	        
	        for (int i=0; i<3; i++)  
	        {  
	            // Control passes to child thread  
	        	
	            t1.yield();  
	            System.out.println(Thread.currentThread().getName() + " ");  
	        }  
	    }  

}
