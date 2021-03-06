package student_olga_dubrovskaja.homework.lesson_7.level_1.task_1_to_task_3;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = makeStringArray(text);
        int maxOccurrence = 0;
        String mostFrequentWord = "";
        for (String word : words) {
            int counter = countWordOccurrences(words, word);
            if (counter > maxOccurrence) {
                maxOccurrence = counter;
                mostFrequentWord = word;
            }
        }
        return mostFrequentWord;
    }

    public int countWordOccurrences(String[] words, String wordToCheck) {
        int counter = 0;
        for (String word : words) {
            if (wordToCheck.equals(word)) {
                counter++;
            }
        }
        return counter;
    }

    public String[] makeStringArray(String text) {
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[\\W_]", "");
        }
        return words;
    }

}
