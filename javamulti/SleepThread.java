package javamulti;

public class SleepThread extends Thread{
	
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
		
		// sleep() -- It sleeps a thread for the specified amount of time.
		
		SleepThread st = new SleepThread();
		
		st.run();

	}

}
