package student_olga_dubrovskaja.homework.lesson_7.level_7.task_13;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();

        test.testFindMostFrequent();
        test.testTwoSameOccurrence();
    }

    public void testFindMostFrequent() {
        WordService wordService = new WordService();
        String text = "I have some cute cute cute cats";
        String expectedResult = "cute";
        System.out.println(wordService.findMostFrequentWord(text));
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
