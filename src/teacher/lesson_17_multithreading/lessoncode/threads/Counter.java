package teacher.lesson_17_multithreading.lessoncode.threads;

public class Counter {
    private int count;

    public void inc() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
