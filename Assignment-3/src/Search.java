import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    public static void searchByName(ArrayList<Employee> list) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        int flag = 0; 
        for (Employee employee : list) {
            if (employee.getEm(0).equals(name)) {
                System.out.println("Exists");
                System.out.println(employee.toString());
                flag = 1;
                break;
            }    
        }
        if (flag == 0) {
            System.out.println("No employee with name : " + name + " exists in our record");
        }
        sc.close();
    }
}
