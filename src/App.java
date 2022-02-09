class App{
    public static void main(String[] args) {
        int choice = -1;
        do {
            Menu.menuDisplay();
            System.out.print("Enter your choice : ");
            choice = Scan.sc.nextInt();
            if (choice == 1){
                new Circle();
            }
            if (choice == 2) {
                new Rectangle();
            }
            if (choice == 3) {
                new Triangle();
            }
            if (choice == 4) {
                new Square();
            }
            if (choice == 5) {
                new Sphere();
            }
            if (choice == 6) {
                new Cylinder();
            }
            else{
                System.out.println("\nEnter a valid choice.");
            }
        } while (choice!=0);
        Scan.sc.close();
    }
}
