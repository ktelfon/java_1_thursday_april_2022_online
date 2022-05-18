package student_olga_dubrovskaja.homework.lesson_3.level_7.task29;

import java.util.Scanner;

class DocumentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Document document1 = new Document("Passport");
        System.out.print("Insert your " + document1.getDocumentType() + " number here: " );
        document1.setDocumentNumber(scanner.next());
        System.out.print("Insert country of issue: ");
        document1.setCountryOfIssue(scanner.next());
        document1.printDocumentInfo();
    }
}
