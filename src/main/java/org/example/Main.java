import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a shape type:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 5) {
                break;
            }

            System.out.print("Enter the name of the shape: ");
            String name = scanner.nextLine();

            Shape shape = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter the width: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter the height: ");
                    double height = scanner.nextDouble();
                    shape = new Rectangle(name, width, height);
                    break;
                case 2:
                    System.out.print("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(name, radius);
                    break;
                case 3:
                    System.out.print("Enter the length of side 1: ");
                    double side1 = scanner.nextDouble();
                    System.out.print("Enter the length of side 2: ");
                    double side2 = scanner.nextDouble();
                    System.out.print("Enter the length of side 3: ");
                    double side3 = scanner.nextDouble();
                    shape = new Triangle(name, side1, side2, side3);
                    break;
                case 4:
                    System.out.print("Enter the side length: ");
                    double sideLength = scanner.nextDouble();
                    shape = new Square(name, sideLength);
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            System.out.println("Area of " + shape.name + ": " + shape.getArea());
            System.out.println("Perimeter of " + shape.name + ": " + shape.getPerimeter());
        }
    }
}
