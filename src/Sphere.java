public class Sphere {
    float radius;
    void get_dim(){
        System.out.print("\nEnter radius  : ");
        radius= Scan.sc.nextFloat();
        try {
            Check.check(radius);
        } catch (myException e) {
            get_dim();
        }    
    }
    void area(){
        float area = 3.14f;
        area = area*radius*radius;
        area = area*4;
        System.out.print("The area of the sphere with radius "+radius+" is : ");
        System.out.printf("%.2f\n",area); 
    }
    void volume(){
        float volume = 3.14f;
        volume = volume*radius*radius*radius;
        volume = volume*4/3;
        System.out.print("The volume of the sphere with radius "+radius+" is : ");
        System.out.printf("%.2f\n",volume); 
    }
    Sphere(){
        get_dim();
        area();
        volume();
    }
}
