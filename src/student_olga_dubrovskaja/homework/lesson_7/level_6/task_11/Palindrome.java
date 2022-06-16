package student_olga_dubrovskaja.homework.lesson_7.level_6.task_11;

class Palindrome {
    boolean isPalindrome(String text) {
        char[] letters = text.toLowerCase().toCharArray();
        for (int i = 0; i < letters.length / 2; i++) {
            if (letters[i] != letters[letters.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}
