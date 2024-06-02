package lessons.lesson_05;

import java.util.Scanner;

public class StatsHelper {

    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread readThread = new Thread(() -> {
            Scanner in = new Scanner(System.in);
            while (in.hasNextLine()) { // (in.hasNextLine() && !Thread.interrupted())
                String line = in.nextLine();
                count++;
            }
        });

        readThread.setDaemon(true);
        readThread.start();
        readThread.interrupt();

        while (true) {
            System.out.println(count + " messages inputted by user");
            Thread.sleep(1000);
        }
    }
}
