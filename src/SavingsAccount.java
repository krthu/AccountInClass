public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(double rateInPercent, String name, double  amount){
        super(amount, name);
        this.interestRate = rateInPercent/100;
    }


    public void addInterest(){
        double intrest = this.getBalance() * interestRate;
        deposit(intrest);
    }

    public double transfer(Account toAccount, double amount){
        if(withdraw(amount) != 0) {
            toAccount.deposit(amount);
        }
        return 0;
    }

}
