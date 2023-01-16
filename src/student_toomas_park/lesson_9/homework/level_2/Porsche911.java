package student_toomas_park.lesson_9.homework.level_2;

public class Porsche911 extends Car {
    private int topSpeed;

    public Porsche911(int releaseYear) {
        super(releaseYear);
    }
    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
}
