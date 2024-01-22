package Challenge_7;

import java.util.concurrent.TimeUnit;

public class Timer {

    public static void timer (int timeLimit, boolean countDown) {

        if (countDown) {
            while (timeLimit > 0) {
                System.out.println("Time remaining: " + timeLimit + " seconds");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                timeLimit--;
            }
        } else {
            for (int seconds = 0; seconds <= timeLimit; seconds++) {
                System.out.println("Elapsed time: " + seconds + " seconds");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}