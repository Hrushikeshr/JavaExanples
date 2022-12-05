package multithreading;

public class JoinThread extends Thread {
	
	// join() -- 
	
	
	public void run() {
		
		for(int i = 0; i < 6; i++) {
			
			try {
				
				Thread.sleep(500);
				
			}catch(InterruptedException e) {
				
				System.out.println(e);
			}
			
			System.out.println(i);
		}
	}
    
      

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// creating three threads  
		JoinThread t1 = new JoinThread();    
		  
		
		
        // thread t1 starts  
		
        t1.start();   
        
        // starts second thread, when first thread t1 is died.  
        try  {    
        	
           t1.join();  
            
        }catch(Exception e){
        	
        	System.out.println(e);
        	
        }    
        
        // start t2 and t3 thread   
        JoinThread t2 = new JoinThread();  
        t2.start();   
        
        JoinThread t3 = new JoinThread();  
        t3.start();    

	}

}
