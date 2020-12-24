import first.FirstTask;
import second.SecondTask;

public class Main {

    public static void main(String[] args) {
        System.out.println("FIRST");
        FirstTask.completeFirst();

        System.out.println("\n\nSECOND");
        SecondTask secondTask = new SecondTask();
        secondTask.completeSecond();
    }
}
