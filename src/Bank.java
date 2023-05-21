import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    Map<Client, List<Account>> clientAccounts = new HashMap<>();
    Map<Account, Client> accountClient = new HashMap<>();

    public void addAccount(Client client, Account account) {
        clientAccounts.computeIfAbsent(client, k -> new ArrayList<>()).add(account);
        accountClient.put(account, client);
    }

    public List<Account> getAccounts(Client client) {
        return clientAccounts.get(client);
    }

    public Client findClient(Account account) {
        return accountClient.get(account);
    }
}
