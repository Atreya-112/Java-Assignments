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

    public void getEm(){
        System.out.println("Name : " + name);
        System.out.print("Age : " + age + "\t");System.out.print("Date of birth : " + dob);
        System.out.println("Address : " + address); 
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
