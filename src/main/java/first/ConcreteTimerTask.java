package first;

import java.time.ZonedDateTime;
import java.util.TimerTask;

public class ConcreteTimerTask extends TimerTask {

    private int number;

    public ConcreteTimerTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number + "        " + ZonedDateTime.now().toString());
    }
}
