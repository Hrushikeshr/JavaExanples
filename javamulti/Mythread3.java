package javamulti;

public class Mythread3 extends Thread {
	
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
		
		Mythread3 t = new Mythread3();
		
		t.run();
		
		Mythread3 t1 = new Mythread3();
		
		t1.run();
		
		

	}

}
