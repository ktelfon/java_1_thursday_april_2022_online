package student_olga_dubrovskaja.homework.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bernie", 8, "Black");
        dog1.voice();
        dog1.happyBirthday();
        dog1.changeColor("White");
        dog1.voice();
    }
}
