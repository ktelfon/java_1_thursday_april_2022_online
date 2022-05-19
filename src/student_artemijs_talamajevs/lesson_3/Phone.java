package student_artemijs_talamajevs.lesson_3;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "private for model lost")
class Phone {

    String model; // private

    Phone(String model) {
        this.model = model;
    }

    String getModel() {
        return this.model;
    }


    class PhoneDemo {

        public static void main(String[] args) {
            Phone myPhone = new Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }

    }
}

