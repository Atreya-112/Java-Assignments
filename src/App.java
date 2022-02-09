class App{
    public static void main(String[] args) {
        String choice = "";
        do {
            Menu.menuDisplay();
            System.out.print("Enter your choice : ");
            choice = Scan.sc.nextLine();
            switch (choice) {
                case "1":
                    new Circle();
                    break;
                case "2":
                    new Rectangle();
                    break;
                case "3":
                    new Triangle();
                    break;
                case "4":
                    new Square();
                    break;
                case "5":
                    new Sphere();
                    break;
                case "6":
                    new Cylinder();
                    break;
                case "0":
                    break;    
                default:
                System.out.println("\nEnter a valid choice.");
                    break;
            }
        } while (!choice.equals("0"));
        Scan.sc.close();
    }
}
