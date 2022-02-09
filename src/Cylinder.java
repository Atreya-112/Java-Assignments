 public class Cylinder{
    float height;
    float radius;
    void get_dim(){
        System.out.print("\nEnter radius : ");
        radius= Scan.sc.nextFloat();
        System.out.print("Enter height : ");
        height= Scan.sc.nextFloat();
        try {
            Check.check(radius);
            Check.check(height);
        } catch (myException e) {
            get_dim();
        } 
    }
    void area(){
        float pi = 3.14f;
        float area = 0.00f;
        area = area + 2*pi*(radius+height)*radius; 
        System.out.print("The area of the cylinder with height "+height+" and base "+radius+" is : ");
        System.out.printf("%.2f\n",area); 
    }
    void volume(){
        float v = 3.14f;
        v = v*radius*radius*height;
        System.out.print("The volume of the cylinder with height "+height+" and base "+radius+" is : ");
        System.out.printf("%.2f\n",v);   
    }      
    Cylinder(){
        get_dim();
        area();
        volume();
    }
}
