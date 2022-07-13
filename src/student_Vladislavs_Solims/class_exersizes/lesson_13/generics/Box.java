package student_Vladislavs_Solims.class_exersizes.lesson_13.generics;

public class Box<T> {

    private T item;

    public Box(T item) {
        this.item = item;
    }
public boolean isBoxFull(){
        return item != null;
}
    public T getItem() {
        return item;
    }
}
