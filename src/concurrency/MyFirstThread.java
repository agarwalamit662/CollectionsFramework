package concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by amitagarwal3 on 8/22/2017.
 */
public class MyFirstThread {

    public static void main(String[] args){

        Task task = new Task();
        Thread t = new Thread(task); // NEW
        t.start();// RUNNABLE

        try {
            //Thread.sleep(3000);

            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Inside Main");

    }

}

class Task implements Runnable{

    @Override
    public void run() {
        System.out.println("Inside Run .. ");
        go();
    }

    private void go(){
        System.out.println("Inside Go");
        more();
    }

    private void more(){
        System.out.println("Inside more");
    }

}
