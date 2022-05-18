package student_olga_dubrovskaja.homework.lesson_3.level_5;

class Dog {
    private String name;
    private int age;
    private String color;

    Dog (String dogName, int dogAge, String dogColor) {

        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }
    void voice() {
        for(int counter=0; counter<3; counter++) {
            System.out.println(this.name);
        }
        System.out.println(this.name + " is a " + this.color +" dog and it is " + this.age + " years old.");
    }

    void happyBirthday() {

        this.age++;
    }

    void changeColor(String dogColor) {

        this.color = dogColor;
    }
}
