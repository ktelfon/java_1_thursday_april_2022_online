package teacher.lesson_9_inheritance.lessoncode.bicycle;

public class MountainBicycle extends Bicycle {

    protected int gear;

    public MountainBicycle(String brand, int speed) {
        super(brand, speed);
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void accelerate() {
        speed = speed + 5;
    }

    @Override
    public String toString() {
        return "MountainBicycle{" +
                "gear=" + gear +
                ", brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}
