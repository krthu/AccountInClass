import java.security.PublicKey;

public class Account {
    private double balance;
    private String name;

    private static int count = 0; // Class Variable

    public Account() {
        this.balance = 0.0;
        this.count += 1;
    }

    public Account(double balance){
        this.balance = balance;
        this.count++;
    }

    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
        this.count++;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public double withdraw(double amount){
        if(this.balance >= amount && amount > 0){
            this.balance -= amount;
            return amount;
        }
        return 0;
    }
    public int getCount(){
        return count;
    }

    public String toString() {
        return ("name: " + name + " balance: " + balance);
    }

}
