package student_igor_peresunko.homework.lesson3.level3;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher =
        "Методы не те, sayHello должен печатать Hello, а он работает как setter")

public class Robot {

    private String hello;
    private String name;
    public void sayHello(String hello) {this.hello = hello;}

    public String getHello() {return hello;}

    public void sayYourName(String name) {this.name = name;}

    public String getName() {return name;}


}


