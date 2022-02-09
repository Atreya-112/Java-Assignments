import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        File file  = new File("F:\\Java Assignments\\Assignment-3\\src\\Employees.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        ArrayList<Employee> eList = new ArrayList<>();
        String row = "";
        Employee e = new Employee();
        while ((row = reader.readLine()) != null) {
            String[] eData = row.split(",",0);
            e.setEmp(eData[0], eData[1], eData[2], eData[3]);
            eList.add(e);
        }
        reader.close();
        System.out.println(eList);
    }
}
