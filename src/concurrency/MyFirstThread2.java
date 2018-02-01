package concurrency;

/**
 * Created by amitagarwal3 on 8/22/2017.
 */
public class MyFirstThread2 extends Thread {

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

    public static void main(String[] args){


        MyFirstThread2 t = new MyFirstThread2(); // NEW

        t.start(); // RUNNABLE

        System.out.println("Inside Main");

    }

}
