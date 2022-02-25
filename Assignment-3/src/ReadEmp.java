import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class ReadEmp {
    //returns ArrayList, by reading data in Employees.csv and making objects out of it and adding those objects to the list.
    public static ArrayList<Employee> read() throws Exception{
        File file  = new File("Employees.csv");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        ArrayList<Employee> eList = new ArrayList<>();
        String row = "";
        while ((row = reader.readLine()) != null) {
            String[] eData = row.split(",",0);
            Employee e = new Employee();
            e.setEmp(eData[0], eData[1], eData[2], eData[3]);
            eList.add(e);
        }
        reader.close();
        return eList;
    }
}
