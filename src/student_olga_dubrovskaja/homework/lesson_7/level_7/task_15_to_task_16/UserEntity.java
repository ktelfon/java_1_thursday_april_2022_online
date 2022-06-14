package student_olga_dubrovskaja.homework.lesson_7.level_7.task_15_to_task_16;

class UserEntity {
    private static int counter = 1;
    private int id = 0;
    private String name;
    private String surname;
    private int personalNumber;

    UserEntity(String name, String surname, int personalNumber) {
        this.id = counter;
        counter++;
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }
}
