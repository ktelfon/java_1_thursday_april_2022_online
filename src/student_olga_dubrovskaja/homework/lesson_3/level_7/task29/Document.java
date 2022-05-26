package student_olga_dubrovskaja.homework.lesson_3.level_7.task29;

class Document {
    private String documentType;
    private String documentNumber;
    private String countryOfIssue;

    Document(String type) {
        this.documentType = type;
    }

    void printDocumentInfo() {
        System.out.println("Document type: " + this.documentType);
        System.out.println("Document number: " + this.documentNumber);
        System.out.println("Country of issue: " + this.countryOfIssue);
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setCountryOfIssue(String countryOfIssue) {
        this.countryOfIssue = countryOfIssue;
    }
}
