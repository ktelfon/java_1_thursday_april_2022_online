package student_toomas_park.lesson_6.homework.level_3;

import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldContainNumber();
        test.shouldNotContainNumber();
        test.shouldCount();
        test.shouldCountZero();
        test.shouldReplaceFirstNumber();
        test.shouldNotReplaceFirstNumber();
        test.shouldReplaceAll();
        test.shouldNotReplaceAll();
        test.shouldRevert();
        test.shouldSort();
    }
    public static void shouldContainNumber(){
        ArrayService testArrayService = new ArrayService();
        int[] testArray = {5, 4, 3, 2, 1};
        int testNumber = 3;
        boolean expectResult = true;
        checkTestResult(testArrayService.contains(testArray, testNumber) == expectResult, "Test contains number " + testNumber + " ");
    }
    public static void shouldNotContainNumber(){
        ArrayService testArrayService = new ArrayService();
        int[] testArray = {5, 4, 3, 2, 1};
        int testNumber = 6;
        boolean expectResult = false;
        checkTestResult(testArrayService.contains(testArray, testNumber) == expectResult, "Test NOT contains number " + testNumber + " ");
    }
    public static void shouldCount(){
        ArrayService testArrayService = new ArrayService();
        int[] testArray = {5, 4, 4, 4, 1};
        int testNumber = 4;
        int expectResult = 3;
        checkTestResult(testArrayService.count(testArray, testNumber) == expectResult, "Test count must be 3 : ");
    }
    public static void shouldCountZero(){
        ArrayService testArrayService = new ArrayService();
        int[] testArray = {5, 4, 4, 4, 1};
        int testNumber = 2;
        int expectResult = 0;
        checkTestResult(testArrayService.count(testArray, testNumber) == expectResult, "Test count must be 0 : ");
    }

    public static void shouldReplaceFirstNumber(){
       ArrayService testArrayService = new ArrayService();
        int[] numbers = {5, 3, 3, 2, 1};
        int numberToReplace = 3;
        int newNumber = 8;
        int[] expectResult = {5, 8, 3, 2, 1};
        testArrayService.replaceFirst(numbers, numberToReplace, newNumber);
        checkTestResult(Arrays.equals(numbers, expectResult), "Test repalced first number " + numberToReplace + " with " + newNumber + " : ");
    }
    public static void shouldNotReplaceFirstNumber(){
        ArrayService testArrayService = new ArrayService();
        int[] numbers = {5, 3, 3, 2, 1};
        int numberToReplace = 13;
        int newNumber = 8;
        int[] expectResult = {5, 3, 3, 2, 1};
        testArrayService.replaceFirst(numbers, numberToReplace, newNumber);
        checkTestResult(Arrays.equals(numbers, expectResult), "Test NOT repalce first number " + numberToReplace + " with " + newNumber + " : ");
    }
    public static void shouldReplaceAll(){
        ArrayService testArrayService = new ArrayService();
        int[] numbers = {5, 3, 3, 2, 1};
        int numberToReplace = 3;
        int newNumber = 8;
        int[] expectResult = {5, 8, 8, 2, 1};
        testArrayService.replaceAll(numbers, numberToReplace, newNumber);
        checkTestResult(Arrays.equals(numbers, expectResult), "Test repalced all numbers " + numberToReplace + " with " + newNumber + " : ");
    }
    public static void shouldNotReplaceAll(){
        ArrayService testArrayService = new ArrayService();
        int[] numbers = {5, 3, 3, 2, 1};
        int numberToReplace = 13;
        int newNumber = 8;
        int[] expectResult = {5, 3, 3, 2, 1};
        testArrayService.replaceAll(numbers, numberToReplace, newNumber);
        checkTestResult(Arrays.equals(numbers, expectResult), "Test NOT repalced all numbers " + numberToReplace + " with " + newNumber + " : ");
    }
    public static void shouldRevert(){
        ArrayService testArrayService = new ArrayService();
        int[] numbers = {5, 4, 3, 2, 1};
        int[] expectResult = {1, 2, 3, 4, 5};
        testArrayService.revert(numbers);
        checkTestResult(Arrays.equals(numbers, expectResult), "Test revert numbers : ");
    }


    public static void shouldSort(){
        ArrayService testArrayService = new ArrayService();
        int[] numbers = {5, 2, 3, 4, 1};
        int[] expectResult = {1, 2, 3, 4, 5};
        testArrayService.sort(numbers);
        checkTestResult(Arrays.equals(numbers, expectResult), "Test sorting numbers : ");
    }

    private static void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " True ");
        } else {
            System.out.println(testName + " False ");
        }
    }
}
