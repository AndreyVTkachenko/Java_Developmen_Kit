package seminars.seminar_05.task_02_1;

public class ThreadA implements Runnable{

    private String nameA;
    private Switcher switcher;

    public ThreadA(String nameA, Switcher switcher) {
        this.nameA = nameA;
        this.switcher = switcher;
    }

    @Override
    public void run() {
        while (true) {
            try {
                switcher.setSwitcher(!switcher.getSwitcher());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
