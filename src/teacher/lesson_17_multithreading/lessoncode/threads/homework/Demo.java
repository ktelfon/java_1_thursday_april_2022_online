package teacher.lesson_17_multithreading.lessoncode.threads.homework;

public class Demo {
    public static void main(String[] args) {
      task6();
    }

    public static void task6(){
        var state = new NotThreadSafeIdGeneratorComplexState();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(state.nextId() + " " + state.isEven());
                }
            }).start();
        }
    }

    public static void task4(){
        NotThreadSafeIdGenerator generator = new NotThreadSafeIdGenerator();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(generator.nextId());
                }
            }).start();
        }
    }
}
