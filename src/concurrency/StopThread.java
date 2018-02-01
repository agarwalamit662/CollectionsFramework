package concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by amitagarwal3 on 8/23/2017.
 */
public class StopThread {

    private static boolean stop;
    private static synchronized void requestStop(){
        stop= true;
    }
    private static synchronized boolean stop(){
        return stop;
    }

    public static void main(String[] args) throws InterruptedException{

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (!stop()){
                    System.out.println("In While..");
                }
            }
        }).start();

        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }

}
