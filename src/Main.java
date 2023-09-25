import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Account davidAcc = new Account(1000.0, "David");
        SavingsAccount savingsAccount = new SavingsAccount(2, "Luna", 1000);
        Account saving2 = new Account(1500.0, "Susan");
        Account saving3 = new Account(2500.0, "Lois");
        Account saving4 = new Account(500.0, "Laura");



        savingsAccount.addInterest();
        savingsAccount.transfer(saving2, 200);

        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(davidAcc);
        accounts.add(savingsAccount);
        accounts.add(saving2);
        accounts.add(saving3);
        accounts.add(saving4);

        System.out.println(accounts.size());

        for (Account account: accounts) {

        }

        for (Account account: accounts) {
            System.out.println(account);
        }


    }

}