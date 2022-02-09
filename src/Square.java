public class Square {
    float side;
    void getDimensions(){
        System.out.print("\nEnter side  : ");
        side = Scan.sc.nextFloat();
        try {
            Check.check(side);
        } catch (Exception myException) {
            getDimensions();
        }    
    }
    void perimeter(){
        float perimeter = 0.00f;
        perimeter = perimeter + 4*(side);
        System.out.print("Perimeter of the square is with side "+ side +" : ");
        System.out.printf("%.2f\n",perimeter);
    }
    void area(){
        float area = 1.00f;
        area = area*side*side;
        System.out.print("Area of the square is with side "+ side +" : ");
        System.out.printf("%.2f\n",area);
    }
    Square(){
        getDimensions();
        perimeter();
        area();
    }
}
