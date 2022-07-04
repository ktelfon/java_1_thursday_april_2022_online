package student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.UIAction;

import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.AuthorSearchCriteria;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.SearchCriteria;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.TitleSearchCriteria;
import student_olga_dubrovskaja.homework.lesson_12.level6.task30_to_task38.YearOfIssueSearchCriteria;

import java.util.Scanner;

public class ComplexSearchCriteriaUIAction implements UIAction {

    @Override
    public void execute() {
    }

    public SearchCriteria[] criteria() {

        SearchCriteria[] criteria = new SearchCriteria[2];
        Scanner sc = new Scanner(System.in);
        String userInput;

        for (int i = 0; i < 2; i++) {
            System.out.println("1 = author, 2 = title, 3 = year of issue");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            switch (userSelectedMenuNumber) {
                case 1:
                    System.out.println("Enter author");
                    userInput = sc.nextLine();
                    criteria[i] = new AuthorSearchCriteria(userInput);
                    break;
                case 2:
                    System.out.println("Enter title");
                    userInput = sc.nextLine();
                    criteria[i] = new TitleSearchCriteria(userInput);
                    break;
                case 3:
                    System.out.println("Enter year of issue");
                    userInput = sc.nextLine();
                    criteria[i] = new YearOfIssueSearchCriteria(userInput);
                    break;
            }
        }
        return criteria;
    }
}
