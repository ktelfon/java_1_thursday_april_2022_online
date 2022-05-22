package student_toomas_park.lesson_3.homework.level_1;

class Robot{
    String name;
    public Robot(String robotName) {
        this.name = robotName;
    }
    public void sayHello() {
        System.out.println("Привет!");
    }
    public void sayName(){
        System.out.println("Меня зовут " + this.name);
    }


}
