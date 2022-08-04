package teacher.lesson_17_multithreading.lessoncode.threads.homework;

import java.util.concurrent.atomic.AtomicInteger;

public class NotThreadSafeIdGenerator {
    private AtomicInteger id;

    public NotThreadSafeIdGenerator() {
        this.id = new AtomicInteger();
    }

    public int nextId() {
        return id.getAndIncrement();
    }

}
