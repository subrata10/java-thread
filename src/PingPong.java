/**
 * This class extending from thread
 * This is one of the approach to create thread.
 */
public class PingPong extends Thread {

    private String word;

    private int delay; // how long to pause in milliseconds

    public PingPong(String whatToSay, int delayTime) {
        word = whatToSay;
        delay = delayTime;
    }

    public void run() {
        try {
            for(;;) { // loops forever
                System.out.print(word +" ");
                Thread.sleep(delay); // sleep method can throw exception, so it is capture by catch clause
            }
        } catch (InterruptedException e) {
            return;
        }
    }

    public static void main(String[] args) {
        new PingPong("ping", 33).start();
        new PingPong("PONG", 100).start();
    }
}
