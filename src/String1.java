import java.util.Scanner;

public class String1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        String s = sc.nextLine();
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////
////        System.out.println(s.substring(a,b + 1));
//        String str = "just a text";
//        System.out.println(str.charAt(3));
//        System.out.println(str.substring(5, 6));
//
//        System.out.println(str.charAt(12));
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().replaceAll(" ","");
        String n = scanner.nextLine().replaceAll(" ","");

        System.out.println(s.equals(n));
    }
}
