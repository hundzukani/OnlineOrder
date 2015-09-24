package za.co.counting.proxy;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hmanganyi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyThread thread = new MyThread();
        thread.start();
        
        synchronized(thread) {
            try {
                System.out.println("Waiting for thread : " + thread.getName());
                thread.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
