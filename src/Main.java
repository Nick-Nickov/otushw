import java.util.*;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client1 = new Client("Ivan", 30);
        Client client2 = new Client("Petr", 40);

        Account account1 = new Account("123456", 1000);
        Account account2 = new Account("654321", 2000);

        bank.addAccount(client1, account1);
        bank.addAccount(client2, account2);

        System.out.println(bank.getAccounts(client1).get(0).accountNumber);
        System.out.println(bank.findClient(account2).name);
    }
}
