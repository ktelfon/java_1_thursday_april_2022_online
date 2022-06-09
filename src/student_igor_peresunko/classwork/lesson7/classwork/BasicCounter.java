package student_igor_peresunko.classwork.lesson7.classwork;

import java.util.Objects;

public class BasicCounter {
    private int counter;

    BasicCounter(){

    }

    public int getCounter(){
        return counter;
    }

    public void increment(){
        counter++;
    }

    public void decrement(){
        if (isPositive(counter)){
        counter--;
        }
    }

    public void clear(){
        counter = 0;
    }

    public void setCounter(int counter){
        if(isPositive(counter)){
            this.counter =counter;
        }else{
            clear();
        }
    }
    private boolean isPositive(int value){
        return value > 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicCounter that = (BasicCounter) o;
        return counter == that.counter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(counter);
    }
}
