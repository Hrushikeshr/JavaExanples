package javamulti;


// getName()	It returns the name of the thread
// setName()	It changes the name of the thread.


public class GetSetName extends Thread {

	public void run()  
    {    
        System.out.println("Thread is running...");    
    }    
	
    public static void main(String args[])  
    {   
        // creating two threads   
    	GetSetName t1=new GetSetName();    
    	GetSetName t2=new GetSetName();    
    	
    	
        // return the name of threads  
        System.out.println("Name of t1: "+ t1.getName());    
        System.out.println("Name of t2: "+t2.getName());  
        
         
        
        // change the thread name   
        t1.setName("user_defned_name 1");    
        t2.setName("user_defned_name 2");  
        
        
        // print the thread after changing   
        System.out.println("After changing name of t1: "+t1.getName());  
        System.out.println("After changing name of t2: "+t2.getName());  
        
        
        System.out.println("Id of t1: "+t1.getId());   
        System.out.println("Id of t2: "+t2.getId());   
        
        
        // start t1  and t2 threads   
        t1.start();    
        t2.start();  
    }
}
