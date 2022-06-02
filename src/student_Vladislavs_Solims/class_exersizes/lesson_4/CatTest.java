package student_Vladislavs_Solims.class_exersizes.lesson_4;

public class CatTest {
    public static void main(String[] args) {
        test1();
        test2();
        test3();

    }

    public static void test1() {
        Cat cat = new Cat("Tom", 12);
        int exprectedValue = 13;
        int realValue = cat.makeOlder(1);

        if (exprectedValue == realValue) {
            System.out.println("Test 1 PASSED!");
        } else {
            System.out.println("Test 1 FAILED!");
        }
    }
    public static void test2(){
        Cat cat2 = new Cat("Borja" , 12);
        cat2.feed(CatFood.MEAT);
        boolean expectedValue = false ;
        boolean realValue = cat2.isHungry();
        if (expectedValue == realValue) {
            System.out.println("Test 2 PASSED!");
        }else{
            System.out.println("Test 2 FAILED!");
        }
    }
    public static void test3(){
        Cat cat3 = new Cat("Stepa" , 10);
        cat3.feed(CatFood.CHICKEN);
        boolean expectedValue = false;
        boolean realValue = cat3.isHungry();
        if(expectedValue==realValue){
            System.out.println("Test 3 PASSED !");
        }else{
            System.out.println("Test 3 FAILED!");
        }


    }
}
