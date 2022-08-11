package student_toomas_park.lesson_6.homework.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayService {

    public boolean contains(int[] numbers, int numberToSearch) {
        boolean contains = false;
        for (int i : numbers) {
            if (i == numberToSearch) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public int count(int[] numbers, int numberToSearch) {
        int count = 0;
        for (int i : numbers) {
            if (i == numberToSearch) {
                count++;
            }
        }
        return count;
    }
    public boolean replaceFirst(int[] numbers, int numberToReplace, int newNumber) {
        boolean replace = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToReplace) {
                numbers[i] = newNumber;
                replace = true;
                break;
            }
        }
        return replace;
    }
    public boolean replaceAll(int[] numbers, int numberToReplace, int newNumber) {
        boolean replace = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToReplace) {
                numbers[i] = newNumber;
                replace = true;
            }
        }
        return replace;
    }
    public void revert(int[] numbers){
        int n = 0;
        for (int i = 0; i < numbers.length / 2; i++) {
            n = numbers[i];
            numbers[i] = numbers[(numbers.length - 1) - i];
            numbers[(numbers.length - 1) - i] = n;
        }
    }
    public void sort(int[] numbers){
        int n;
        for (int i = 0; i < numbers.length; i++) {
            for (int k = i + 1; k < numbers.length; k++) {
                if (numbers[i] > numbers[k]) {
                    n = numbers[i];
                    numbers[i] = numbers[k];
                    numbers[k] = n;
                }
            }
        }
    }
}
