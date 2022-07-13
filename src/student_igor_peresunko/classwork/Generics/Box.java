package student_igor_peresunko.classwork.Generics;

public class Box<T> {

    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}


