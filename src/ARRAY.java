import java.util.*;

public class ARRAY {

    // write a method here
    static int[] getFirstAndLast(int[] array) {
        int len = array.length;
        int array2[] = {array[0], array[len - 1]};
        return array2;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}