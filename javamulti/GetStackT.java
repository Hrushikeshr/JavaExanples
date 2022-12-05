package javamulti;



/**  
 * 
 * getStackTrace()	It returns an array of stack trace elements representing the stack dump of the thread. */


public class GetStackT {
	
	public static void first()  
    {  
        second();  
    }  
    public static void second()   
    {  
        third();  
    }  
    public static void third()   
    {  
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();  
        System.out.println("Displaying Stack trace using StackTraceElement in Java");  
        
        for(StackTraceElement st : stackTrace)  
        {  
            // print the stack trace   
            System.out.println(st);  
        }  
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		first();  
		
	}

}
