package lessons.lesson_05;

public class TicTac implements Runnable{

    private final String bracket;
    private final Object monitor;

    public TicTac(String bracket, Object monitor) {
        this.bracket = bracket;
        this.monitor = TicTac.class;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (monitor) {
                System.out.printf(bracket);
                try {
                    Thread.sleep(300);
                    monitor.notify();
                    monitor.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
