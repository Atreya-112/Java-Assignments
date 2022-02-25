class accountSafe {
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
    public accountSafe(String name){
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

class personSafe extends Thread{
    String name;
    accountSafe account;    
    public void run(){
        for (int i = 0; i < 5; i++) {
            account.withdraw(200);
        }
    }
    personSafe(String name,accountSafe account){
        this.name = name;
        this.account = account;
    }
} 
public class AccountOverdrawSafeDemo {
    public static void main(String[] args) {
        accountSafe a = new accountSafe("Joint Account");
        personSafe A = new personSafe("Husband", a);
        personSafe B = new personSafe("Wife",a);
        A.start();
        B.start();
    }
}
