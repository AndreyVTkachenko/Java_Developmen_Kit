package seminars.seminar_05.task_02_1;

public class ThreadB implements Runnable{

    private String nameB;
    private Switcher switcher;

    public ThreadB(String nameA, Switcher switcher) {
        this.nameB = nameB;
        this.switcher = switcher;
    }

    @Override
    public void run() {
        int count = 100;
        while (count > 0) {
            if (switcher.getSwitcher()) {
                count--;
                System.out.println("count= " + count);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
