package student_Vladislavs_Solims.class_exersizes.lesson_3;

public class CatTest {

    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
Cat cat = new Cat("Tom", 12);
int expectedValue=13;
int realValue= cat.make0lder(1);

if(expectedValue==realValue){
    System.out.println("Test 1 passsed");
}
else{
    System.out.println("Test 1 failed");
}
    }

}
