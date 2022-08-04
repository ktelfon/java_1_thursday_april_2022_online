package teacher.lesson_17_multithreading.lessoncode.threads.homework;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class NotThreadSafeIdGeneratorComplexState {
    private AtomicInteger id;
    private AtomicBoolean even;

    public NotThreadSafeIdGeneratorComplexState() {
        this.id = new AtomicInteger();
        this.even = new AtomicBoolean();
    }

    public int nextId() {
        this.even.set(isEven(id.incrementAndGet()));
        return id.get();
    }

    public boolean isEven() {
        return this.even.get();
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}
