package first;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class FirstTask {

    public static void completeFirst() {
        ConcreteTimerTask ct1 = new ConcreteTimerTask(1);
        ConcreteTimerTask ct2 = new ConcreteTimerTask(5);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(ct1, 0,  1000);
        timer.scheduleAtFixedRate(ct2, 0, 5000);
        try {
            int timeOfAction = 30;
            TimeUnit.SECONDS.sleep(timeOfAction);
        } catch (InterruptedException ignored) {

        }
        timer.cancel();
    }
}
