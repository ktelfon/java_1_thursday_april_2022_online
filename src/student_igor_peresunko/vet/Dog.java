package student_igor_peresunko.vet;

public class Dog extends Animal{

    public Dog(String name , int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id =" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
