package javamulti;

public class AliveThread extends Thread  {

	 public void run()  
	    {  
	        try   
	        {  
	            Thread.sleep(300);  
	            System.out.println("is run() method isAlive "+Thread.currentThread().isAlive());  
	        }  
	        catch (InterruptedException ie) {  
	        }  
	    }  
	 
	 
	    public static void main(String[] args)  
	    {  
	    	AliveThread t1 = new AliveThread();  
	    	
	        System.out.println("before starting thread isAlive: "+t1.isAlive());  
	        
	        
	        t1.start();  
	        System.out.println("after starting thread isAlive: "+t1.isAlive());  
	        
	    }

}
