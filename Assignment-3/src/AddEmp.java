import java.io.FileWriter;
import java.util.Scanner;

public class AddEmp {
    public static void add() {
        try {
            Scanner sc = new Scanner(System.in);
            String file  = "Employees.csv";
            FileWriter writer = new FileWriter(file,true);
            String fname,lname,emailAddress,age,dob;
            System.out.print("Enter first name : ");fname = sc.nextLine();
            System.out.print("Enter last name : ");lname = sc.nextLine();
            System.out.print("Enter address : ");emailAddress = sc.nextLine();
            System.out.print("Enter age : ");age = sc.nextLine();
            System.out.print("Enter dob : ");dob = sc.nextLine();
            writer.append("\n"+fname+" "+lname+","+emailAddress+","+age+","+dob);
            System.out.println("Employee added successfully.");
            writer.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
