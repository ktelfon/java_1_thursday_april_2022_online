package student_Vladislavs_Solims.homework.lesson_6.level_4;

import java.util.Arrays;

public class WhileInfiniteLoop {

    public void infiniteWhile(){
        while (true){
            System.out.println("Thats infinity");
        }
    }
    public void infiniteFor(){
        for (int i = 0; i <=0 ; i++) {
            System.out.println("Thats infinity");
        }
    }
    public void infiniteWhileBreak() {
        int i = 0;
        while (true) {
            i++;
            System.out.println("in the loop");
            if (i == 3) {
                System.out.println("We are done!");
                break;
            }
        }
    }
    public void infiniteForBreak(){
        for (int i = 0; i >= 0; i++) {
            System.out.println("in the loop");
            if (i == 5){
                System.out.println("Bye!");
                break;
            }
        }
    }
    public void whileLoopContinue(){
        int i = 0;
        int[] array= {1,3,8,15,5,9,7,5};
        while (i < array.length){
            if (array[i] == 5){
                i++;
                continue;
            }
            array[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
    public void forLoopContinue(){
        int[] array= {1,3,8,15,5,9,7,5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5){
                continue;
            }
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}


