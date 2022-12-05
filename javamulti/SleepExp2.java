package javamulti;

public class SleepExp2 extends Thread{
    private static Thread t1;

    public void run()
    {
        for(int i=1;i<5;i++)
        {
//            try
//            {
//                Thread.sleep(800);
//            }catch(InterruptedException e){System.out.println(e);}
            System.out.println("Thread 2 is running");
        }
    }
}
