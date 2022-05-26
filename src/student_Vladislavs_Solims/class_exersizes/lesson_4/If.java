package student_Vladislavs_Solims.class_exersizes.lesson_4;

public class If {
    public static void main(String[] args) {

        int bigNumber = 100;
        int smallNumber = 1;
        if(bigNumber != smallNumber){
            System.out.println("Non same number");
        }
        int x = 10;
        if((x<5)&&(x<15)){
    System.out.println("Within bounds !");
        }
        String name = "Jim";
        if("Bob".equals(name)||"Jim".equals(name)&&x==10){
            System.out.println("Hello Jim or bob");
        }

    }


}
