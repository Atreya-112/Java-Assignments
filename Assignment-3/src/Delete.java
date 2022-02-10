import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Delete {
    public  static void main(String[] args) throws Exception {
        ArrayList<Employee> list = ReadEmp.read();
        Collections.sort(list, new UserNameComparator());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name : ");
        String fn = sc.nextLine();
        System.out.print("Enter last name : ");
        String ln = sc.nextLine();
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
