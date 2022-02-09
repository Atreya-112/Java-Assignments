import java.io.FileWriter;
import java.util.Scanner;

public class AddEmp {
    public static void add() {
        try {
            Scanner sc = new Scanner(System.in);
            String file  = "Employees.csv";
            FileWriter writer = new FileWriter(file,true);
            String name,address,age,dob;
            System.out.print("Enter name : ");name = sc.nextLine();
            System.out.print("Enter address : ");address = sc.nextLine();
            System.out.print("Enter age : ");age = sc.nextLine();
            System.out.print("Enter dob : ");dob = sc.nextLine();
            writer.append("\n"+name+","+address+","+age+","+dob);
            System.out.println("Employee added successfully.");
            writer.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
