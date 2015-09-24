package za.co.counting.proxy;

/**
 *
 * @author hmanganyi
 */
public class MyThread extends Thread {

    @Override
    public void run() {

        synchronized (this) {
            for (int i = 0; i < 23; i++) {
                System.out.println("I : " + i);
            }
            notify();
        }
    }

}
