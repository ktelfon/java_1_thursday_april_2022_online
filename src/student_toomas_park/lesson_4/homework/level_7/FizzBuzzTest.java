package student_toomas_park.lesson_4.homework.level_7;

import student_toomas_park.lesson_4.homework.level_7.FizzBuzz;
import teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_4.LightColorDetector;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest FizzBuzzTest = new FizzBuzzTest();
        FizzBuzzTest.detect();
    }

    public void detect() {
        int number1 = 579;
        String expectedResult = "Green";
        FizzBuzz FizzBuzz = new FizzBuzz();
        String realResult = FizzBuzz.detect(number1);
        if (realResult == expectedResult) {
            System.out.println("Light test = OK! Expect : " + expectedResult + " Real :  " + realResult);
        } else {
            System.out.println("even test = FAIL! Expect : " + expectedResult + " , Real :  " + realResult);
        }
    }
}
