package student_toomas_park.lesson_5.homework.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayUtilTest {

        public static void main(String[] args) {
            ArrayUtilTest test = new ArrayUtilTest();
            test.shouldCreateArray();
            test.findMaxNumber();
            test.findMinNumber();
        }

        public void shouldCreateArray() {
            ArrayUtil arrayUtil = new ArrayUtil();
            int testLength = 8;
            int[] testArray = arrayUtil.createArray(testLength);
            System.out.print("arrayLength test:");
            Results(testLength, testArray.length);
        }

        public void findMaxNumber() {
            ArrayUtil arrayUtil = new ArrayUtil();
            int[] array = {5, 4, 3, 2, 1};
            int maxNumber = arrayUtil.findMaxNumber(array);
            System.out.print("ArrayUtil max number test:");
            Results(5, maxNumber);
        }
        public void findMinNumber() {
            ArrayUtil arrayUtil = new ArrayUtil();
            int[] array = {5, 4, 3, 2, 1};
            int minNumber = arrayUtil.findMinNumber(array);
            System.out.print("ArrayUtil min number test:");
            Results(1, minNumber);
    }

        public void Results(int expectedResult, int testResult) {
            if (expectedResult == testResult) {
                System.out.println(" Work ");
            } else {
                System.out.println(" Fail ");
            }
        }
}
