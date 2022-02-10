import java.util.ArrayList;

public class Search {
    public static void searchByName(ArrayList<Employee> list) throws Exception{
        System.out.print("Enter first name : ");
        String firstName = Scan.sc.nextLine();
        System.out.print("Enter last name : ");
        String lastName = Scan.sc.nextLine();
        int flag = 0; 
        for (Employee employee : list) {
            if (employee.getEm(0).equals(firstName + " " + lastName)) {
                System.out.println(employee.toString() + " exists in our record.");
                flag = 1;
                break;
            }    
        }
        if (flag == 0) {
            System.out.println("No employee with name : " + firstName + " " + lastName + " exists in our record.");
        }
    }
    public static void searchByAge(ArrayList<Employee> list) throws Exception{
        System.out.print("Enter age : ");
        String age = Scan.sc.nextLine();
        for (Employee employee : list) {
            if (employee.getEm(2).equals(age)) {
                System.out.println(employee.toString() + " has age " + employee.getEm(2));
            }    
        }
    }
    public static void searchByEmail(ArrayList<Employee> list) throws Exception{
        System.out.print("Enter email : ");
        String Email = Scan.sc.nextLine();
        int flag = 0; 
        for (Employee employee : list) {
            if (employee.getEm(1).equals(Email)) {
                System.out.println("Exists");
                System.out.println(employee.toString());
                flag = 1;
                break;
            }    
        }
        if (flag == 0) {
            System.out.println("No employee with e-mail : " + Email + " exists in our record.");
        }
    }
}
