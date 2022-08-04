package teacher.lesson_17_multithreading.lessoncode.threads;

public class Printer implements Runnable {

    private Counter counter;

    public Printer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            counter.inc();
            System.out.println(Thread.currentThread().getName()+ " : " + i);
        }
        System.out.println(counter.getCount());
    }
}
