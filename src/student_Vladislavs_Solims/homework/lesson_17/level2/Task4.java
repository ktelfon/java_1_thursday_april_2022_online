package student_Vladislavs_Solims.homework.lesson_17.level2;

import java.util.concurrent.atomic.AtomicInteger;

public class Task4 {
    private AtomicInteger id;



    public int nextId(){
        return id.incrementAndGet();
    }

    public int getId() {
        return id.get();
    }
    public Task4() {
        this.id = id;
    }
}
