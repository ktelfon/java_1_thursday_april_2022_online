package student_olga_dubrovskaja.homework.lesson_6.level_4.task_18_to_task_21;

import java.util.Arrays;

class WhileInfiniteLoop {
    public void infiniteWhile(){
        while(true){
            System.out.println("in the infinite loop");
        }
    }
}

class ForInfiniteLoop {
    public void infiniteFor(){
        for (int i = 0; i >= 0; i++) {
            System.out.println("in the infinite loop");
        }
    }
}

class WhileInfiniteLoopBreak{
    public void infiniteWhileBreak(){
        int i = 0;
        while(true){
            i++;
            System.out.println("in the loop");
            if (i == 3){
                System.out.println("We are done!");
                break;
            }
        }
    }
}

class ForInfiniteLoopBreak{
    public void infiniteForBreak(){
        for (int i = 0; i >= 0; i++) {
            System.out.println("in the loop");
            if (i == 5){
                System.out.println("Bye!");
                break;
            }
        }
    }
}

class WhileLoopContinue{
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
}

class ForLoopContinue{
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

class LoopsDemo{
    public static void main(String[] args) {
        WhileLoopContinue demoWhileContinue = new WhileLoopContinue();
        demoWhileContinue.whileLoopContinue();
        ForLoopContinue demoForLoopContinue = new ForLoopContinue();
        demoForLoopContinue.forLoopContinue();
        ForInfiniteLoopBreak demoForInfiniteLoopBreak = new ForInfiniteLoopBreak();
        demoForInfiniteLoopBreak.infiniteForBreak();

    }
}