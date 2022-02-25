class AccountSafe {
    private String name;
    private int balance;
    public synchronized void  withdraw(int amount){
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(balance + " remaining.");
        }
        else{
            System.out.println("No balance available.");
            }
    }
    public AccountSafe(String name){
        this.name = name;
        this.balance = 1000;    
    }
    public int getBalance(){
        return balance;
    }
    public void getName(){
        System.out.println(name);
    }
}

class PersonSafe extends Thread{
    String name;
    AccountSafe account;    
    public void run(){
        for (int i = 0; i < 5; i++) {
            account.withdraw(200);
        }
    }
    PersonSafe(String name,AccountSafe account){
        this.name = name;
        this.account = account;
    }
} 
public class AccountOverdrawSafeDemo {
    public static void main(String[] args) {
        AccountSafe a = new AccountSafe("Joint Account");
        PersonSafe A = new PersonSafe("Husband", a);
        PersonSafe B = new PersonSafe("Wife",a);
        A.start();
        B.start();
    }
}
