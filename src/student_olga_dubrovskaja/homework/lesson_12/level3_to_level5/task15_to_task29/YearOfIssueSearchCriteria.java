package student_olga_dubrovskaja.homework.lesson_12.level3_to_level5.task15_to_task29;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return book.getYearOfIssue().equals(this.yearOfIssueToSearch);
    }
}
