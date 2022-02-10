import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Delete {
    public  static void delete() throws Exception {
        ArrayList<Employee> list = ReadEmp.read();
        Collections.sort(list, new UserNameComparator());
        System.out.print("Enter first name : ");
        String fn = Scan.sc.nextLine();
        System.out.print("Enter last name : ");
        String ln = Scan.sc.nextLine();
        for (Employee e : list){
            if(e.getEm(0).equals(fn + " " + ln)){
                list.remove(e);
                break;
            }
        }
        try {
            String file  = "Employees.csv";
            FileWriter writer_clear = new FileWriter(file);
            writer_clear.write("");
            writer_clear.close();
            FileWriter writer = new FileWriter(file,true);
            String name,emailAddress,age,dob;
            int i = 0;
            for (Employee employee : list) {
                name = employee.getEm(0);
                emailAddress = employee.getEm(1);
                age = employee.getEm(2);
                dob = employee.getEm(3);
                i++;
                if (i == list.size()) {
                    writer.append(name+","+emailAddress+","+age+","+dob);
                }
                else{
                    writer.append(name+","+emailAddress+","+age+","+dob+"\n");
                }
            }
            writer.close();
            System.out.println("Employee deleted from record successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
