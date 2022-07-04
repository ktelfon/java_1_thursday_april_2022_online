package student_olga_dubrovskaja.homework.lesson_12.level5.task27;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {
    Set<String> find(String text) {
        Set<String> uniqueWords = new HashSet<>();
        String[] words = text.split(" ");
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        return uniqueWords;
    }

}
