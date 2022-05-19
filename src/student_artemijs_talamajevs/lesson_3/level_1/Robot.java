package student_artemijs_talamajevs.lesson_3.level_1;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Сначало переменные потом конструктор")
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

