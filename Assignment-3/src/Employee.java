public class Employee implements Comparable<Employee>{
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
            case 1:
                return address;
            case 2:
                return age;
            case 3:
                return dob;
            default:
                return "";
        }
    }

    public Employee(){

    }

    //Java Bean standards followed i.e getter / setter merthods added and a no args public constructor added

    public void employeeDetails(){
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("D/O/B   : " + dob);
        System.out.println("Address : " + address);
        System.out.println("************************\n");
    }

    public int nameEquals(String name){
        if (this.name.equals(name)) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString(){
       return name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getEm(0).compareTo(o.getEm(0));
    }

   
}
