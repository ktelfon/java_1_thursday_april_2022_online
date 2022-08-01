package student_toomas_park.lesson_4.homework.level_7;

import student_toomas_park.lesson_4.homework.level_7.FizzBuzz;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.testn1(3);
        test.testn2(5);
        test.testn3(15);
        test.testn4(4);
    }
        public void testn1(int number){
            String expectedResult = "Fizz";
            FizzBuzz testNumber = new FizzBuzz();
            tResult(expectedResult.equals(testNumber.detect(number)), "test 3 ");
        }
        public void testn2(int number){
            String expectedResult = "Buzz";
            FizzBuzz testNumber = new FizzBuzz();
            tResult(expectedResult.equals(testNumber.detect(number)), "test 5 ");
        }
        public void testn3(int number){
            String expectedResult = "FizzBuzz";
            FizzBuzz testNumber = new FizzBuzz();
            tResult(expectedResult.equals(testNumber.detect(number)), "test 15 ");
        }
        public void testn4(int number){
            String expectedResult = "" +number;
            FizzBuzz testNumber = new FizzBuzz();
            tResult(expectedResult.equals(testNumber.detect(number)), "test 4 ");
        }

        public void tResult(boolean result, String test) {
            if (result) {
                System.out.println(test + "OK");
            } else {
                System.out.println(test + "FAIL");
            }
        }
}
