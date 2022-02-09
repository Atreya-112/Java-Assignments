public class Triangle {
    float height,base;
    void getDimensions(){
        System.out.print("Enter height : ");
        height = Scan.sc.nextFloat();
        System.out.print("Enter base : ");
        base = Scan.sc.nextFloat();
        try {
            Check.check(base);
            Check.check(height);
        } catch (myException e) {
            getDimensions();
        } 
        
    }
    void area(){
        float area = 0.5f*height*base;
        System.out.print("Area of the triangle is with height "+height+" and "+base+" : ");
        System.out.printf("%.2f\n",area);
    }
    Triangle(){
        getDimensions();
        area();
    }
}
