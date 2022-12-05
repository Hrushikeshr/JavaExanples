package javamulti;

public class SleepExp1 extends Thread
{
    private static Thread t1;
    @Override
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try
            {
                Thread.sleep(800);
            }catch(InterruptedException e){System.out.println(e);}
            System.out.println("Thread1 is running");
        }
    }
    public static void main(String args[])
    {
        SleepExp1 t1=new SleepExp1();
//        SleepExp1 t2=new SleepExp1();
        SleepExp2 t3 = new SleepExp2();
        t3.start();

        t1.start();

//        t2.start();
        int n = 0;

    }
}
