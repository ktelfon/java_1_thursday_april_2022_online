package student_igor_peresunko.classwork.Generics;

import student_igor_peresunko.vet.Animal;

public class Box<T extends Animal> {

    private T item;
    private String label;

    public Box(T item) {
        this.item = item;
    }

    public  boolean isBosFull(){
        return item != null;
    }

    public T getItem() {
        return item;
    }
}


