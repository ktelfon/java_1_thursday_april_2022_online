package student_olegs_liliks.trenirovka.lesson_3.lesson_3.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Robot1 {
    String name;

    Robot1(String robotName) {
        this.name = robotName;
    }
        public void sayHello(){
            System.out.println("Hello " + this.name);
        }
    }


