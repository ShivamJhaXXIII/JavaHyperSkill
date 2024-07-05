//import java.util.*;
//
//public class ARRAY {
//
//    // write a method here
//    static int[] getFirstAndLast(int[] array) {
//        int len = array.length;
//        int array2[] = {array[0], array[len - 1]};
//        return array2;
//    }
//
//    /* Do not change code below */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] array = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//        int[] result = getFirstAndLast(array);
//        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
//    }
//}



import java.util.Arrays;

public class ARRAY {

    public static void main(String[] args) {

        long[] longNumbers = {100000000001L,100000000002L,100000000003L};
//        char[] array = { 'a', 'b', 'c', 'd' };
//
//        char[] array2 = new char[0];
//
//        char[] array3 = new char[1];
//
//        char[] array4 = new char[10000000000000]; // This line gives compilation error
        //int[] numbers = new int[30];

        System.out.println(Arrays.toString(longNumbers));
    }
}