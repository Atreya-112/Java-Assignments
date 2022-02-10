import java.io.FileWriter;

public class AddEmp {
    public static void add() {
        try {
            String file  = "Employees.csv";
            FileWriter writer = new FileWriter(file,true);
            String fname,lname,emailAddress,age,dob;
            System.out.print("Enter first name : ");fname = Scan.sc.nextLine();
            System.out.print("Enter last name : ");lname = Scan.sc.nextLine();
            System.out.print("Enter email - address : ");emailAddress = Scan.sc.nextLine();
            System.out.print("Enter age : ");age = Scan.sc.nextLine();
            System.out.print("Enter dob : ");dob = Scan.sc.nextLine();
            writer.append("\n"+fname+" "+lname+","+emailAddress+","+age+","+dob);
            System.out.println("Employee added successfully.");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
