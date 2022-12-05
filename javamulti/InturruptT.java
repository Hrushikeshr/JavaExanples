package javamulti;


// interrupt() --It interrupts the thread.

public class InturruptT extends Thread {

	 public void run()  
	    {    
	        try  
	        {    
	            Thread.sleep(1000);    
	            System.out.println("inturrupt..."); 
	            
	        }catch(InterruptedException e){   
	        	
	            throw new RuntimeException("Thread interrupted..."+e);  
	              
	        }    
	    }    
	    public static void main(String args[])  
	    {    
	    	InturruptT t1=new InturruptT();    
	        t1.start();    
	        
	        try  
	        {    
	            t1.interrupt();   
	            
	        }catch(Exception e){
	        	
	        	System.out.println("Exception handled "+e);
	        	
	        }    
	     }
	    
	    
	    // activeCount()	It returns the number of active threads in the current thread's thread group.

}
