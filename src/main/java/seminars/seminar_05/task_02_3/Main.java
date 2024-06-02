package seminars.seminar_05.task_02_3;

public class Main {
    static volatile Boolean switcher = false;
    static volatile Boolean work = true;

    public static void main(String[] args) {
        Thread changer = new Thread(() -> {
            while (work){
                switcher = !switcher;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread counter = new Thread(() -> {
            int count = 100;
            while (count >= 0){
                if (switcher){
                    System.out.println(Thread.currentThread().getName() + " " + count--);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
            work = false;
        });

        changer.start();
        counter.start();
    }
}
