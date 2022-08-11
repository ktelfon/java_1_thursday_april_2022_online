package student_igor_peresunko.homework.lesson13;

import teacher.codereview.CodeReview;

import java.util.List;

@CodeReview(approved = true)
public class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(Role canSearchClients) {
        return  roles.contains(canSearchClients);
    }
}
