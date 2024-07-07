package CLASS;

public class Car {

    int yearModel;
    String make;
    int speed;

    void accelerate() {
        this.speed += 5;
    }

    void brake() {
        this.speed -= 5;
        if(this.speed < 0) {
            this.speed = 0;
        }
    }

    public static void main(String[] args) {
        Car one = new Car();
        System.out.println(one.speed = 51);
        System.out.println(one.make = "Mercedes");
        System.out.println(one.yearModel = 2022);

        one.accelerate();
        System.out.println(one.speed);


        one.brake();
        System.out.println(one.speed);
    }
}
