package CLASS;

import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        Class2 instanceOfClass2 = new Class2();

        Rectangle rectangle = instanceOfClass2.new Rectangle(width,height);

        System.out.println(rectangle.area());

    }

    class Rectangle {
        int width;
        int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int area() {
            return height * width;
        }
    }
}
