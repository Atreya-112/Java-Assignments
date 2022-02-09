import java.util.Comparator;

public class Employee implements Comparator<Employee>{
    private String name;
    private String address;
    private String age;
    private String dob; //date of birth

    public void setEmp(String name,String address,String age,String dob){
        this.name = name;
        this.address = address;
        this.age = age;
        this.dob = dob;    
    }

    public String getEm(int i){
        if (i == 0) {
            return name;
        }
        if (i == 1) {
            return address;
        }
        if (i == 2) {
            return age;
        }
        if (i == 3) {
            return dob;
        }
        return "";
    }

    public Employee(){

    }

    //Java Bean standards followed i.e getter / setter merthods added and a no args public constructor added

    @Override
    public String toString(){
        return "Name : " + name + " " + "Age : " + age + " " + "D/o/b : " + dob +  " " + "Address : " + address;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        
        return 0;
    } 


}
