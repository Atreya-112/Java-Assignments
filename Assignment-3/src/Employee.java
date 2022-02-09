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
        switch (i) {
            case 0:
                return name;
        
            default:
                return age;
        }
    }

    public Employee(){

    }

    //Java Bean standards followed i.e getter / setter merthods added and a no args public constructor added

    public int nameEquals(String name){
        if (this.name.equals(name)) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString(){
        return "Name : " + name + "\n" + "Age : " + age + "\n" + "D/o/b : " + dob +  "\n" + "Address : " + address;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        
        return 0;
    } 
}
