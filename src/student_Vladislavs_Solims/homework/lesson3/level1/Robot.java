package student_Vladislavs_Solims.homework.lesson3.level1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Robot {
    public Robot(){

    }
    private String hello;
    private String name;
    public void sayHello(String hello){
        this.hello=hello;
    }
    public String getHello() {
        return hello;
    }
    public void sayYourName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}


