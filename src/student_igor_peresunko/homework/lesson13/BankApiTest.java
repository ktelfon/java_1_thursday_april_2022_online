package student_igor_peresunko.homework.lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankApiTest {
    public static void main(String[] args) {
        List<BankClient> clients = new ArrayList<>();

        clients.add(new BankClient("123", "Igor P"));

        BankApi bankApi = new BankApiImpl(clients);
        Optional<BankClient> client = Optional.empty(); 
        try {
            List<Role> canSearchClients = new ArrayList<>();
            canSearchClients.add(Role.CAN_SEARCH_CLIENTS);
            UserCredentials credentials = new UserCredentials(canSearchClients);
            client = bankApi.findByUid(credentials, "123");
        } catch (AccessDeniedException e) {
            System.out.println("You can't search for users!");
        }
        System.out.println(client);

        client = Optional.empty();

        try {
            List<Role> canSearchClients = new ArrayList<>();
            UserCredentials credentials = new UserCredentials(canSearchClients);
            client = bankApi.findByUid(credentials, "123");
        } catch (AccessDeniedException e) {
            System.out.println("You can't search for users!");
        }
        System.out.println(client);
    }

}
