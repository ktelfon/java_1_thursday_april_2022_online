package student_olga_dubrovskaja.homework.lesson_7.level_7.task_15_to_task_16;

import java.util.ArrayList;

class UserEntityRepository {

    private ArrayList<UserEntity> users = new ArrayList<UserEntity>();

    public boolean createUser(String name, String surname, int personalNumber) {

        for (UserEntity user : users) {
            if (user.getPersonalNumber() == personalNumber) {
                System.out.println("User not created. Personal number was not unique");
                return false;
            }
        }
        users.add(new UserEntity(name, surname, personalNumber));
        return true;
    }

    public UserEntity getUserById(int id) {
        for (UserEntity user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public boolean deleteUser(int id) {
        for (int i =0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                users.remove(users.get(i));
                return true;
            }
        }
        return false;
    }

    public UserEntity getUserByName(String name) {
        for (UserEntity user : users) {
            if (name.equals(user.getName())) {
                return user;
            }
        }
        return null;
    }

    public void printInfo(UserEntity user) {
        System.out.println("User ID: " + user.getId());
        System.out.println("Name: " + user.getName());
        System.out.println("Surname: " + user.getSurname());
        System.out.println("Personal number: " + user.getPersonalNumber());

    }

    public ArrayList<UserEntity> getUsers() {
        return users;
    }

    public static void main(String[] args) {
        UserEntityRepository repository = new UserEntityRepository();
        repository.createUser("Cat", "Catkin", 12);
        repository.createUser("Ishtar", "Ishtarkin", 13);
        repository.createUser("Tundmatu", "Kass", 13);
        // repository.printInfo(repository.getUsers().get(1));
        repository.printInfo(repository.getUserById(2));
        repository.printInfo(repository.getUserByName("Cat"));
    }

}
