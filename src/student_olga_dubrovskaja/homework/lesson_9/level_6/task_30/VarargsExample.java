package student_olga_dubrovskaja.homework.lesson_9.level_6.task_30;

class VarargsExample {

    public int calculateSum(Integer... numbers){
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        printInfo(sum,numbers);
        return sum;
    }

    void printInfo(int sum, Integer... numbers){
        System.out.print("Numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nSum: " + sum);
    }

}
