public class Circle {
    
        float radius;
        void getDimensions(){
            System.out.print("\nEnter radius : ");
            radius = Scan.sc.nextFloat();
            try {
                Check.check(radius);
            } catch (myException e) {
                getDimensions();
            } 
        }
        void circumference(){
            float c = 6.28f;
            c = c*radius;
            System.out.print("The circumference of the circle with radius "+ radius +" is : ");
            System.out.printf("%.2f\n",c); 
        }
        void area(){
            float a = 3.14f;
            a = a*radius*radius;
            System.out.print("The area of the circle with radius "+ radius +" is : ");
            System.out.printf("%.2f\n",a); 
        }
        Circle(){
            getDimensions();
            circumference();
            area();
        }
}
