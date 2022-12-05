package multithreading;

public class MyThread2 extends Thread{
    @Override
    public void run(){
//        int i = 0;
        while (true){
            System.out.println("My thread 2 is running...");
            System.out.println("I am sad.");
//            i++;
        }
    }
}
