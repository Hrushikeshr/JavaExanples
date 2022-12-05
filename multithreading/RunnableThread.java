package multithreading;

class MyThreadRunnable1  implements Runnable{
    public void run(){
        System.out.println("My 1 st runnable Thread!");
    }
}

class MyThreadRunnable2  implements Runnable{
    public void run(){
        System.out.println("My 2nd Runnable Thread!");
    }
}

public class RunnableThread{
    public static void main(String[] args) {
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        MyThreadRunnable2 t2 = new MyThreadRunnable2();

    }
}
