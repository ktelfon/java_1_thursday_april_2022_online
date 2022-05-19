package student_Vladislavs_Solims.homework.lesson_3.level_1_And_3;

public class Robot {
    public Robot(){

    }
    private String hello;
    private String name;
    Robot(String robotName){
        this.name = robotName;
    }
    public void sayHello(String hello){
        this.hello=hello;
    }
    public String getHello() {
        return hello;
    }
    public void sayYourName(String name){
        this.name=name;
    }
void sayYourName(){
        System.out.println("Hello my name is" + this.name);
}

    public String getName() {
        return name;
    }
}


