package student_olga_dubrovskaja.homework.lesson_6.level_3.task_12_to_task_17;

import teacher.codereview.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldContainNumber();
        test.shouldNotContainNumber();
        test.shouldBeThreeOccurrences();
        test.shouldBeZeroOccurrences();
        test.shouldReplaceFirstOccurrence();
        test.shouldDoNothing();
        test.shouldReplaceAll();
        test.shouldNotReplaceAll();
        test.shouldRevertArray();
        test.shouldSort();
        test.shouldSortRepeatedNumbers();

    }

    public void shouldContainNumber() {
        ArrayService testArrayService = new ArrayService();
        int[] testArray = {1, 2, 3, 4};
        int testNumber = 2;
        boolean expectedResult = true;
        checkTestResult(testArrayService.contains(testArray, testNumber) == expectedResult, "TEST contains number: ");

    }

    public void shouldNotContainNumber() {
        ArrayService testArrayService = new ArrayService();
        int[] testArray = {1, 2, 3, 4};
        int testNumber = 5;
        boolean expectedResult = false;
        checkTestResult(testArrayService.contains(testArray, testNumber) == expectedResult, "TEST does not contain number: ");
    }

    public void shouldBeThreeOccurrences() {
        ArrayService testArrayService = new ArrayService();
        int[] testArray = {1, 2, 3, 3, 3};
        int testNumber = 3;
        int expectedResult = 3;
        checkTestResult(testArrayService.countOccurrences(testArray, testNumber) == expectedResult, "TEST contains three occurrences: ");

    }

    public void shouldBeZeroOccurrences() {
        ArrayService testArrayService = new ArrayService();
        int[] testArray = {1, 2, 3, 3, 3};
        int testNumber = 5;
        int expectedResult = 0;
        checkTestResult(testArrayService.countOccurrences(testArray, testNumber) == expectedResult, "TEST contains no occurrences: ");

    }

    public void shouldReplaceFirstOccurrence() {
        ArrayService testArrayService = new ArrayService();
        int[] testArray = {1, 2, 5, 5, 5};
        int numberToReplace = 5;
        int newNumber = 10;
        int[] expectedResult = {1, 2, 10, 5, 5};
        testArrayService.replaceFirstOccurrence(testArray, numberToReplace, newNumber);
        checkTestResult(Arrays.equals(testArray, expectedResult), "TEST replace first occurrence: ");
    }

    public void shouldDoNothing() {
        ArrayService testArrayService = new ArrayService();
        int[] testArray = {1, 2, 5, 5, 5};
        int numberToReplace = 17;
        int newNumber = 10;
        int[] expectedResult = {1, 2, 5, 5, 5};
        testArrayService.replaceFirstOccurrence(testArray, numberToReplace, newNumber);
        checkTestResult(Arrays.equals(testArray, expectedResult), "TEST no occurrences: ");

    }

    public void shouldReplaceAll() {
        ArrayService testArrayService = new ArrayService();
        int[] testArray = {1, 2, 5, 5, 5};
        int numberToReplace = 5;
        int newNumber = 10;
        int[] expectedResult = {1, 2, 10, 10, 10};
        testArrayService.replaceAll(testArray, numberToReplace, newNumber);
        checkTestResult(Arrays.equals(testArray, expectedResult), "TEST replace all occurrences: ");
    }

    public void shouldNotReplaceAll() {
        ArrayService testArrayService = new ArrayService();
        int[] testArray = {1, 2, 5, 5, 5};
        int numberToReplace = 15;
        int newNumber = 10;
        int[] expectedResult = {1, 2, 5, 5, 5};
        testArrayService.replaceAll(testArray, numberToReplace, newNumber);
        checkTestResult(Arrays.equals(testArray, expectedResult), "TEST nothing to replace (all occurrences): ");
    }

    public void shouldRevertArray() {
        ArrayService testArrayService = new ArrayService();
        int[] testArray = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 4, 3, 2, 1};
        testArrayService.revertArray(testArray);
        checkTestResult(Arrays.equals(testArray, expectedResult), "TEST revert array: ");
    }

    public void shouldSort() {
        ArrayService testArrayService = new ArrayService();
        int[] testArray = {5, 4, 3, 2, 1};
        int[] expectedResult = {1, 2, 3, 4, 5};
        testArrayService.sortArray(testArray);
        checkTestResult(Arrays.equals(testArray, expectedResult), "TEST sort array: ");
    }

    public void shouldSortRepeatedNumbers() {
        ArrayService testArrayService = new ArrayService();
        int[] testArray = {5, 4, 4, 4, 1};
        int[] expectedResult = {1, 4, 4, 4, 5};
        testArrayService.sortArray(testArray);
        checkTestResult(Arrays.equals(testArray, expectedResult), "TEST sort array (repeated numbers): ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + "OK");
        } else {
            System.out.println(testName + "FAIL");
        }
    }
}
