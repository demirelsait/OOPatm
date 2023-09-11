public class Hesap {

    private String user_name;
    private String password;
    private int balance;

    public Hesap() {
    }

    public Hesap(String user_name, String password, int balance) {
        this.user_name = user_name;
        this.password = password;
        this.balance = balance;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        System.out.println("Your balance : " + balance);
        System.out.println("The transaction has taken place");
        balance += amount;
        System.out.println("New your balance : " + balance);
    }

    public void withdrawMoney (int amount){
        System.out.println("Your balance : " + balance);
        if (amount > balance){
            System.out.println("Insufficient balance !!!");
        }
        else {
            System.out.println("Your balance : " + balance);
            System.out.println("The transaction has taken place");
            balance -= amount;
        }
    }
}
