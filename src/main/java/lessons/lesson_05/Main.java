package lessons.lesson_05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 3; i++) {
            new MyThread().start();
        }

        for (int i = 0; i < 5; i++) {
            new Thread(new MyRunnable()).start();
        }

        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                System.out.println("3. Hello from " + Thread.currentThread());
            }).start();
        }

        Thread tic = new Thread(new TicTac("[", null));
        Thread tac = new Thread(new TicTac("]", null));
//        tic.setDaemon(true);
//        tac.setDaemon(true);
        tic.start();
        tac.start();
    }
}
