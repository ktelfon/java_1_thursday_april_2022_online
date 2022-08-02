package student_toomas_park.lesson_6.homework.level_3;

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
}
