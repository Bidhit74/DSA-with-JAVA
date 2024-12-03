/* 
public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.username = "Bidhit";
        // b.password = "Bidhit123@@"; // Not set kuyki password privet specifier
        b.setPassword("Bidhit123@@"); // But yah function password ko set kar sakta kuyki yah within the class use hua hai
        System.out.println(b.username);
        // System.out.println(b.password); // password has private access in BankAccount
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String psw) {
        password = psw;
    }
}
    */