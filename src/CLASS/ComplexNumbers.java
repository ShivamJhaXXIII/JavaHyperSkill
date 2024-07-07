package CLASS;

import org.jetbrains.annotations.NotNull;

public class ComplexNumbers {
    double real;
    double image;

    public void add(@NotNull ComplexNumbers num) {
        double newReal = real + num.real;
        double newImage = image + num.image;
        System.out.println("The new complex Number is: "+newReal+"+"+newImage+"i.");
    }

    public void subtract(@NotNull ComplexNumbers num) {
        double newReal = real - num.real;
        double newImage = image - num.image;
        System.out.println("The new complex Number is: "+newReal+"+"+newImage+"i.");
    }


    public static void main(String[] args) {
        ComplexNumbers number = new ComplexNumbers();
        number.real = 10;
        number.image = 4;
// math expression of number = 10.0 + 4.0i

        ComplexNumbers anotherNumber = new ComplexNumbers();
        anotherNumber.real = 6;
        anotherNumber.image = 6;
// math expression of anotherNumber = 6.0 + 6.0i

        number.add(anotherNumber); // number = 16.0 + 10.0i
        number.subtract(anotherNumber);
    }
}
