package student_toomas_park.lesson_4.homework.level_7;


import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FizzBuzz {
    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else return "" + number;
    }
}
