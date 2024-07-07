package CLASS;

class PackageClass1 {

    public static String getString() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        System.out.println(getString());
    }
}
