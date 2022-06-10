package student_Vladislavs_Solims.homework.lesson_5.level_5_and_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayUtilTest {


    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldCreateArray();
        arrayUtilTest.findMaxNumber();
        arrayUtilTest.findMinNumber();

    }

    void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int testLenght = 5;
        int[] testArray = arrayUtil.createArray(testLenght);
        System.out.println("Fill Array Test Result :");
        checkResults(testLenght, testArray.length);


    }

    void findMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 2, 3, 4, 5};
        int maxNumber = arrayUtil.findMaxNumber(array);
        System.out.println("Find Max NUmber Test : ");
        checkResults(5, maxNumber);

    }

    void findMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 2, 3, 4, 5};
        int minNumber = arrayUtil.findMinNumber(array);
        System.out.println("Find Min Number Test : ");
        checkResults(1, minNumber);

    }


    private void checkResults(int expectedResult, int realResult) {
        if (expectedResult == realResult) {
            System.out.println("OK");
        } else {
            System.out.println(" Failed");
        }
    }


}
