public class Rectangle {
    float length;
    float breadth;
    void get_dim(){
        System.out.print("\nEnter length : ");
        length = Scan.sc.nextFloat();
        System.out.print("Enter breadth : ");
        breadth = Scan.sc.nextFloat();
        try {
            Check.check(length);
            Check.check(breadth);
        } catch (myException e) {
            get_dim();
        } 
    }
    void perimeter(){
        float p = 0.00f;
        p = p + 2*(length + breadth);
        System.out.print("Perimeter of the rectangle with length "+ length +" and breadth "+ breadth +" is : ");
        System.out.printf("%.2f\n",p);
    }
    void area(){
        float a = 1.00f;
        a = a*length*breadth;
        System.out.print("Area of the rectangle with length "+ length +" and breadth "+ breadth +" is : ");
        System.out.printf("%.2f\n",a);
    }
    Rectangle(){
        get_dim();
        perimeter();
        area();
    }
}
