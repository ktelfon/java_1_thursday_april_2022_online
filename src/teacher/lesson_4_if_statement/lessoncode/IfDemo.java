package teacher.lesson_4_if_statement.lessoncode;

public class IfDemo {

    public static void main(String[] args) {
        boolean flag = false;
        if (flag) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
        System.out.println();


        boolean flag1 = false;
        boolean flag2 = false;
        if (flag1) {
            System.out.print("flag1");
        } else if (flag2) {
            System.out.print("flag2");
        } else {
            System.out.println("Nothing worked");
        }

        if (!false) {
            System.out.println("NO {}");
        }
        System.out.println("NO {} ELSE");

        boolean testBool = true ? false : false;

        String drink = "cofee";
        switch (drink) {
            case "coffe":
            case "cofee":
            case "coffee":
                System.out.println("I would go for Java!");
                break;
            case "tea":
                System.out.println("Everything but Lipton");
                break;
            default:
                System.out.println("Ugh.. What?");
        }

        int bigNumber = 100;
        int smallNumber = 1;
        if(bigNumber != smallNumber){
            System.out.println("NOT SAME NUMBER");
        }

        int x = 10;
        if ((x < 5) && (x > 15)) {
            System.out.print("Within bounds!");
        }

        String name = "Jim";
        if (("Bob".equals(name) || "Jim".equals(name) || "Jimbo".equals(name)) && x == 10) {
            System.out.print("Hello Jim or Bob");
        }

    }
}
