package student_Vladislavs_Solims.class_exersizes.lesson_16;

public class Printer implements Runnable{

    private Counter counter;

    public Printer(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {

            counter.inc();
            System.out.println(counter.getCount());
        }
    }
}
