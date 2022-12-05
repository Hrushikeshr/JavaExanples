package multithreading;

public class MyThread extends Thread{
    @Override
    public void run(){
//        int i = 0;
        while (true){
            System.out.println("My thread 1 is running...");
            System.out.println("I am happy!");
//            i++;
        }

    }
}
