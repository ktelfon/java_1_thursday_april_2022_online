package teacher.lesson_13_exceptions.lessoncode.homework;

import java.util.List;

public class UserCredentials {
    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(Role canSearchClients) {
        return roles.contains(canSearchClients);
    }
}
