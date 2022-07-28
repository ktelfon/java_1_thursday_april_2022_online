package student_Vladislavs_Solims.homework.lesson_13;

import java.util.List;

public class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole() {
      return true;
    }

    public boolean hasRole(Role canSearchClients) {
        return true;
    }
}
