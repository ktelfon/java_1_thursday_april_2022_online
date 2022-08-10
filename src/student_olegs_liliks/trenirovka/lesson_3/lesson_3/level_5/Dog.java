package student_olegs_liliks.trenirovka.lesson_3.lesson_3.level_5;

public class Dog {
    private String name;
    private int age;
    private String color;

     Dog(String name, int age, String color){
         this.name = name;
         this.age = age;
         this.color = color;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    void changeColor(String newColor) {
        this.color = newColor;
    }

    public void happyBirthday() {
        this.age = this.age + 1;
    }

    public void sayDog(){
       System.out.println("Dog name is " + this.name + " he is "+ this.age + " years old " + "his color ir " + this.color );
   }
}
