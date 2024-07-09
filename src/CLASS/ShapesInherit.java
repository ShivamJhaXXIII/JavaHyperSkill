package CLASS;
import java.util.Scanner;

// Define the base class Shape
class Shape {

    String name;
    Shape(String name) {
        this.name = name;
    }


    String getName() {
        return name;
    }

}

// Define the derived class Rectangle
class Rectangle extends Shape {
    int width;
    int height;

    Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    int getWidth() {
        return width;
    }
    int getHeight() {
        return height;
    }
}

public class ShapesInherit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int width = scanner.nextInt();
        int height = scanner.nextInt();



        Rectangle rectangle = new Rectangle(name, width, height);

        // TODO: Print out the rectangle's name, width, and height
        System.out.println("Name: "+ rectangle.getName());
        System.out.println("Width: "+ rectangle.getWidth());
        System.out.println("Height: "+ rectangle.getHeight());

    }
}