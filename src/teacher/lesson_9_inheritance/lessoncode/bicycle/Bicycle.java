package teacher.lesson_9_inheritance.lessoncode.bicycle;

public class Bicycle implements Drivable{
    protected String brand;
    protected int speed;

    public Bicycle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate() {
        this.speed++;
    }

    public void decelerate() {
        this.speed--;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void drive() {
        System.out.println("Vrum Vrum");
    }
}