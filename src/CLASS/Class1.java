package CLASS;

public class Class1 {
    private String message;

    public Class1(String message) { // constructor
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        Class1 helloWorld = new Class1("Hello, World!");
        System.out.println(helloWorld.getMessage());
    }
}