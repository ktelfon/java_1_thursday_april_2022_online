package teacher.lesson_4_if_statement.lessoncode;

public class CatTest {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1() {
        Cat cat = new Cat("Tom", 12);

        int expectedValue = 13;
        int realValue = cat.makeOlder(1);

        if (expectedValue == realValue) {
            System.out.println("Test 1 PASSED.");
        } else {
            System.out.println("Test 1 FAILED.");
        }
    }

    public static void test2(){
        Cat cat = new Cat("Tom", 12);

        boolean expectedResult = false;
        cat.feed("Chicken");
        boolean realResult = cat.isHungry();

        if (expectedResult == realResult) {
            System.out.println("Test 2 PASSED.");
        } else {
            System.out.println("Test 2 FAILED.");
        }
    }

    public static void test3(){
        Cat cat = new Cat("Tom", 12);

        boolean expectedResult = true;
        cat.feed("Tuna");
        boolean realResult = cat.isHungry();

        if (expectedResult == realResult) {
            System.out.println("Test 3 PASSED.");
        } else {
            System.out.println("Test 3 FAILED.");
        }
    }
}
