package student_Vladislavs_Solims.class_exersizes.lesson_16;

public class Counter {
    private int count;

    public void inc() {
        synchronized ((this)) {
        count++;
    }

}
    public int getCount() {
        return count;
    }
}
