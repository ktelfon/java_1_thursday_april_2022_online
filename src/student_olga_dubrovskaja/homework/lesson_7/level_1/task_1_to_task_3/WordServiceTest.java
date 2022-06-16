package student_olga_dubrovskaja.homework.lesson_7.level_1.task_1_to_task_3;

import teacher.codereview.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.testArrayJustWords();
        test.testArrayPunctuation();
        test.testArrayManySpaces();
        test.testFindMostFrequent();
        test.testTwoSameOccurrence();
        test.testCountOccurrences();
        test.testCountOccurrencesNone();

    }

    public void testArrayJustWords() {
        WordService wordService = new WordService();
        String text = "I have some cute cats";
        String[] expectedResult = {"I", "have", "some", "cute", "cats"};
        checkResult(Arrays.equals(expectedResult, wordService.makeStringArray(text)), "Simple String array test");
    }

    public void testArrayPunctuation() {
        WordService wordService = new WordService();
        String text = "I have cats, or cats have me?";
        String[] expectedResult = {"I", "have", "cats", "or", "cats", "have", "me"};
        checkResult(Arrays.equals(expectedResult, wordService.makeStringArray(text)), "String array test with punctuation");
    }

    public void testArrayManySpaces() {
        WordService wordService = new WordService();
        String text = "I have    some   cute    cats";
        String[] expectedResult = {"I", "have", "some", "cute", "cats"};
        checkResult(Arrays.equals(expectedResult, wordService.makeStringArray(text)), "String array test with more spaces");
    }

    public void testCountOccurrences() {
        WordService wordService = new WordService();
        String[] words = {"I", "have", "cats", "or", "cats", "have", "me"};
        String word = "have";
        int expectedResult = 2;
        checkResult(expectedResult == wordService.countWordOccurrences(words, word), "Test counter method (2 occurrences):");

    }

    public void testCountOccurrencesNone() {
        WordService wordService = new WordService();
        String[] words = {"I", "have", "cats", "or", "cats", "have", "me"};
        String word = "dog";
        int expectedResult = 0;
        checkResult(expectedResult == wordService.countWordOccurrences(words, word), "Test counter method (no occurrences):");

    }


    public void testFindMostFrequent() {
        WordService wordService = new WordService();
        String text = "I have some cute, cute cats";
        String expectedResult = "cute";
        checkResult(expectedResult.equals(wordService.findMostFrequentWord(text)), "Most frequent word test");
    }

    public void testTwoSameOccurrence() {
        WordService wordService = new WordService();
        String text = "I have cats, or cats have me?";
        String expectedResult = "have";
        checkResult(expectedResult.equals(wordService.findMostFrequentWord(text)), "Most frequent word test (should return first occurring word)");
    }


    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
