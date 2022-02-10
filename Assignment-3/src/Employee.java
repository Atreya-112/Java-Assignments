public class Employee{
    private String name;
    private String emailAddress;
    private String age;
    private String dob; //date of birth

    public void setEmp(String name,String emailAddress,String age,String dob){
        this.name = name;
        this.emailAddress = emailAddress;
        this.age = age;
        this.dob = dob;    
    }

    public String getEm(int i){
        switch (i) {
            case 0:
                return name;
            case 1:
                return emailAddress;
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
        System.out.println("Address : " + emailAddress);
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

    public String NameWithAge(){
        return name + " : " + age;
    }
}
