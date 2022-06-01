package student_olga_dubrovskaja.homework.lesson_5.level_7.task41;

/*
Task 41

Проведите рефакторинг программ написанных
в рамках Lesson 5 day 4 с использованием
созданного класса ArrayUtil и его методов.
 */

class ArrayExercises3 {
    public static void main(String[] args) {
        ArrayExercises3 task41 = new ArrayExercises3();
        task41.methodForTask25();
        task41.methodForTask26();
        task41.methodForTask27();
        task41.methodForTask28();
        task41.methodForTask29();
        task41.methodForTask30();

    }

    /*
    Task 25
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
     */
    public void methodForTask25() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[arrayUtil.getArrayLengthFromUser()];
        arrayUtil.fillArrayWithNumbersFromUser(array);
        arrayUtil.printArrayToConsole(array);
    }

    /*
    Task 26
    Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
     */
    public void methodForTask26() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[arrayUtil.getArrayLengthFromUser()];
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
    }

    /* Task 27
    Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
     */

    public void methodForTask27() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[arrayUtil.getArrayLengthFromUser()];
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        System.out.println("Max number in array: " + arrayUtil.findMaxNumber(array));

    }
    /* Task 28
    Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
     */

    public void methodForTask28() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[arrayUtil.getArrayLengthFromUser()];
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        System.out.println("Min number in array: " + arrayUtil.findMinNumber(array));
    }

    /*  Task29
    Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.
     */
    public void methodForTask29() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[arrayUtil.getArrayLengthFromUser()];
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        System.out.println("Even numbers in array: " + arrayUtil.findEvenNumbers(array));
    }

    /* Task30
    Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.
     */

    public void methodForTask30() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[arrayUtil.getArrayLengthFromUser()];
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        System.out.println("Odd numbers in array: " + arrayUtil.findOddNumbers(array));
    }
}
