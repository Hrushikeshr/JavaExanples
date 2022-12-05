package javamulti;

public class SusResT extends Thread {

	public void run()  
    {    
        for(int i=1; i<4; i++)  
        {    
            try  
            {  
                
                 sleep(500);  
                
                 System.out.println(Thread.currentThread().getName());   
                 
            }catch(InterruptedException e){
            	
            	System.out.println(e);
            }   
            
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        // creating three threads   
    	SusResT t1=new SusResT ();    
    	t1.start(); 
    	
    	SusResT t2=new SusResT (); 
    	t2.start(); 
    	
    	SusResT t3=new SusResT ();   
    	t3.start();
         
       
         
        
        // suspend t2 thread   
        // t2.suspend();   
        
        
          
        
        //t2.resume(); // resume t2 thread  
    	
    	  t3.stop();  
    	  System.out.println("Thread t3 is stopped");    
    }    

}
