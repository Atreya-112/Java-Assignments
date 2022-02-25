/**
 * AccountOverdrawSafeDemo
 */
class Account {
    private String name;
    private int balance;
    public  void  withdraw(int amount){
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(balance + " remaining.");
        }
        else{
            System.out.println("No balance available.");
        }
    }
    public Account(String name){
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
class person extends Thread{
    String name;
    Account account;    
    public void run(){
        for (int i = 0; i < 5; i++) {
            account.withdraw(200);
        }
    }
    person(String name,Account account){
        this.name = name;
        this.account = account;
    }
} 
public class AccountOverdrawDemo {
    public static void main(String[] args) {
        Account a = new Account("Joint Account");
        person A = new person("Husband", a);
        person B = new person("Wife",a);
        A.start();
        B.start();
    }
}