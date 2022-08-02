package student_toomas_park.lesson_7.homework.level_6;


public class Palindrome {
    public static boolean isPalindrome(String word){
        char[] text = word.toLowerCase().toCharArray();
        for (int i = 0; i < text.length / 2; i++) {
            if (text[i] != text[text.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
