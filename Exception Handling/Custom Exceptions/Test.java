public class Test {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(20000);
        try {
            account.withdraw(10000);
            System.out.println("Withdraw successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double amount) {
        this.balance = amount;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new InsufficientFund();
        }
        balance -= amount;
    }
}



class InsufficientFund extends Exception {
    public InsufficientFund() {
        super("Insufficient balance cannot withdraw");
    }
    
}
