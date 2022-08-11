package student_Vladislavs_Solims.homework.lesson_17.level_3;

public class NotThreadSafeIdGeneratorComplexState {

    private int id;
    private boolean even;

    public int nextId() {
        id++;
        this.even = isEven(id);
        return id;
    }

    public boolean isEven() {
        return this.even;
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}
