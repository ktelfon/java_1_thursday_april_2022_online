package student_olegs_liliks.homework.lesson_3.level_5.task_18;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class Dog {
    private String name;

    Dog(String dogName) {
        this.name=dogName;
    }

    void voice() {
        System.out.println(this.name +" "+ this.name +" "+ this.name);

    }
}

