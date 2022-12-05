package javamulti;

public class UserSetP extends Thread {

	public void run()  
    {    
        System.out.println("running...");    
    }    
	
    public static void main(String args[])  
    {    
        
    	UserSetP t1=new UserSetP();    
    	UserSetP t2=new UserSetP();  
    	
        // set the priority  
        t1.setPriority(4);  
        t2.setPriority(7);  
        
        
        System.out.println("Priority of thread t1 is: " + t1.getPriority());   
        System.out.println("Priority of thread t2 is: " + t2.getPriority());   
        
        
        // call the run() method  
        t1.start();  
    }  

}
