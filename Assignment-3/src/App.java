import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class App {
    public  static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name = name.toUpperCase();
        System.out.println(name);
        sc.close();
    }
}
